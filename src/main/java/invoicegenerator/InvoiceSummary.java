package invoicegenerator;

import java.util.Objects;

public class InvoiceSummary {
    private int totalNumberOfRides;
    private double totalFare;
    private double averageFarePerRide;

    public InvoiceSummary(int totalNumberOfRides, double totalFare) {
        this.totalNumberOfRides = totalNumberOfRides;
        this.totalFare = totalFare;
        this.averageFarePerRide = this.totalFare / this.totalNumberOfRides;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        InvoiceSummary summary = (InvoiceSummary) obj;
        return this.getTotalNumberOfRides() == summary.getTotalNumberOfRides() && this.getTotalFare() == summary.getTotalFare()
                && this.getAverageFarePerRide() == summary.getAverageFarePerRide();
    }

    public int getTotalNumberOfRides() {
        return totalNumberOfRides;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public double getAverageFarePerRide() {
        return averageFarePerRide;
    }


}