package jp.co.kiramex.animal;

public class Animal {
  //フィールド
    private String animalName;
    private int animalAge;

    //コンストラクタ
    public Animal() {
    }

    //引数ありのコンストラクタ
    public Animal(String animalName,int animalAge) {

        this.animalName = animalName;
        this.animalAge = animalAge;

    }

    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    //報告するメソッド
    public void say() {
        System.out.println(this.animalName + "です。 " + this.animalAge + "才です。");
    }

}
