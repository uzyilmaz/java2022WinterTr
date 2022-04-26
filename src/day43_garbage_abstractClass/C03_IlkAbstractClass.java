package day43_garbage_abstractClass;

public abstract class C03_IlkAbstractClass {
    public abstract void abstractMethod();
    // Abstract methodlar child class larin MUTLAKA  override
    // etmesi gereken methodlardir
    // Dolayisiyla hicbir zaman direk calistirilmazlar
    // ve bu sebeple method body sine ihtiyac yoktur.

    // Bir class in veya method un abstract olup olmadigini anlayabilir miyiz?
    // - Evet. abstract yaziyorsa abstract tir, yazmiyorsa degildir.
    // (abstract olmayan class lara concrete class/method denir.)

    // Abstract methodlar body e sahip olamaz.
    // Concrete methodlar ise method body si olmadan olusturulamaz

}
