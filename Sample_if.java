class Sample_if {
  public static void main(String[] args) {
    int percent = 3;

    if (percent >= 50) {
      System.out.println("傘を持っていきましょう");
    } else if (percent >= 30) {
      System.out.println("折り畳み傘を持っていきましょう");
    } else {
      System.out.println("傘は必要ありません");
    }
  }
}
