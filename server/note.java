"""
-------------------------------------------------------
Note Data Structure - (x, y, height, width, colour, message)
-------------------------------------------------------
Author: Rahnuma Haque
ID: 169024593
Email: haqu4593@mylaurier.ca
__updated__ = "2026-01-27"
-------------------------------------------------------
"""
public class Note {
  private final int x, y; 
  private final int width, height;
  private final String colour;
  private final String message;

  public Note(int x, int y, int width, int height, String colour, String message) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.colour = colour;
    this.message = message;
  }

  public int getX() {
    return x; }

  public int getY() {
    return y; }
 
  public int getWidth() {
    return width; }
  
  public int getHeight() {
    return height; }

  public int getColour() {
    return colour; }

  public int getMsg() {
    return message; }
  
  /* -----------------------------------------------------
  check if note COMPLETELY overlaps with another note, n 
  ('Completely overlaps' - occupy the exact same rectangular region)
  ----------------------------------------------------- */
  public boolean completelyOverlaps(Note n) {
    return this.x == n.x && this.y == n.y && this.height == n.height && this.width == n.width;
  }

  /* -----------------------------------------------------
  check if note PARTIALLY overlaps with another note, n 
  ----------------------------------------------------- */
  
  // confirm if required ?

  @Override // native java function, explicity use defined function
  public String toString() {
    return String.format("Note (x = %d, y = %d, colour = %s, message = %s)", x, y, colour, message);
  }
  
}
