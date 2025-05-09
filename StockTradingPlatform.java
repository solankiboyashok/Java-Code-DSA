import java.util.ArrayList;
import java.util.List;

public class StockTradingPlatform {
    // Define the market data
    private List<Stock> marketData;

    // Define the user's portfolio
    private Portfolio portfolio;

    public StockTradingPlatform() {
        // Initialize the market data
        marketData = new ArrayList<>();
        marketData.add(new Stock("AAPL", 150.0));
        marketData.add(new Stock("GOOG", 2500.0));
        marketData.add(new Stock("MSFT", 200.0));

        // Initialize the user's portfolio
        portfolio = new Portfolio();
    }

    public void displayMarketData() {
        System.out.println("Market Data:");
        for (Stock stock : marketData) {
            System.out.println(stock.getSymbol() + ": " + stock.getPrice());
        }
    }

    public void buyStock(String symbol, int quantity) {
        // Check if the stock exists in the market data
        Stock stock = getStockBySymbol(symbol);
        if (stock != null) {
            // Calculate the total cost of the purchase
            double totalCost = stock.getPrice() * quantity;

            // Check if the user has enough funds
            if (portfolio.getFunds() >= totalCost) {
                // Update the user's portfolio
                portfolio.addStock(stock, quantity);
                portfolio.setFunds(portfolio.getFunds() - totalCost);

                System.out.println("Bought " + quantity + " shares of " + symbol + " at " + stock.getPrice());
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("Stock not found");
        }
    }

    public void sellStock(String symbol, int quantity) {
        // Check if the stock exists in the user's portfolio
        Stock stock = portfolio.getStockBySymbol(symbol);
        if (stock != null) {
            // Calculate the total revenue of the sale
            double totalRevenue = stock.getPrice() * quantity;

            // Update the user's portfolio
            portfolio.removeStock(stock, quantity);
            portfolio.setFunds(portfolio.getFunds() + totalRevenue);

            System.out.println("Sold " + quantity + " shares of " + symbol + " at " + stock.getPrice());
        } else {
            System.out.println("Stock not found in portfolio");
        }
    }

    public void displayPortfolio() {
        System.out.println("Portfolio:");
        for (Stock stock : portfolio.getStocks()) {
            System.out.println(stock.getSymbol() + ": " + stock.getQuantity() + " shares at " + stock.getPrice());
        }
        System.out.println("Funds: " + portfolio.getFunds());
    }

    private Stock getStockBySymbol(String symbol) {
        for (Stock stock : marketData) {
            if (stock.getSymbol().equals(symbol)) {
                return stock;
            }
        }
        return null;
    }
}

class Stock {
    private String symbol;
    private double price;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getQuantity'");
    }

    public void setQuantity(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setQuantity'");
    }
}

class Portfolio {
    private List<Stock> stocks;
    private double funds;

    public Portfolio() {
        stocks = new ArrayList<>();
        funds = 10000.0; // initial funds
    }

    public void addStock(Stock stock, int quantity) {
        stocks.add(new Stock(stock.getSymbol(), stock.getPrice() * quantity));
    }

    public void removeStock(Stock stock, int quantity) {
        for (Stock s : stocks) {
            if (s.getSymbol().equals(stock.getSymbol())) {
                s.setQuantity(s.getQuantity() - quantity);
                if (s.getQuantity() <= 0) {
                    stocks.remove(s);
                }
                break;
            }
        }
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public Stock getStockBySymbol(String symbol) {
        for (Stock stock : stocks) {
            if (stock.getSymbol().equals(symbol)) {
                return stock;
            }
        }
        return null;
    }
}