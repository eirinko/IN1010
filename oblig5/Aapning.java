class Aapning extends HvitRute{
  public Aapning(int rad, int kol){
    super(rad, kol);
  }

  public char tilTegn(){
    return '.';
  }

  @Override
  public boolean erAapning(){
    return true;
  }
}
