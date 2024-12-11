/**
* Represents the Grammy Winners and the following information
*/
public class GrammyWinners {
  private int year; // The year the artist/group won
  private String category; // The category of the Grammy award
  private String nominee; // The artist/group nominated for the award

  // Constructor
  public GrammyWinners(int year, String category, String nominee) {
    this.year = year;
    this.category = category;
    this.nominee = nominee;
  }

  // Accessor Methods
  public int getYear() {
    return year;
  }

  public String getCategory() {
    return category;
  }

  public String getNominee() {
    return nominee;
  }

  // To-String Methods
  public String toStringCategory() {
    return "Category: " + category;
  }

  public String toStringNominee() {
    return "Nominee: " + nominee;
  }


  public String toStringYear() {
    return "Year: " + year;
  }


  public String toString() {
    return toStringNominee() + "\n" + toStringCategory() + "\n" + toStringYear();
  }
}
