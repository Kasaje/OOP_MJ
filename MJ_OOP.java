import java.util.Scanner;

class MJ_OOP{
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("------------------------------- Welcome to OOP -------------------------------\n");
        System.out.println("---------- Description ----------\n");
        System.out.println("ธาตุไฟ + ดาบ  ->   เพิ่มความเสียหาน 20%");
        System.out.println("ธาตุไฟ + ธนู   ->   เพิ่มความเสียหาน 10% ");
        System.out.println("ธาตุไฟ + หอก  ->   เพิ่มความเสียหาน 10% ");
        System.out.println("ธาตุไฟ + โล่   ->   เพิ่มความเสียหาน  5% \n");

        System.out.println("ธาตุน้ำ + ดาบ  ->   โอกาสดาเมจ *2 20%");
        System.out.println("ธาตุน้ำ + ธนู   ->   โอกาสดาเมจ *2  5% ");
        System.out.println("ธาตุน้ำ + หอก  ->   โอกาสดาเมจ *2 20%");
        System.out.println("ธาตุน้ำ + โล่   ->   โอกาสดาเมจ *2  5% \n");

        System.out.println("ธาตุลม + ดาบ  ->   โอกาสไม้โดนโจมตี 20% ");
        System.out.println("ธาตุลม + ธนู   ->   โอกาสดาเมจ *2 20%");
        System.out.println("ธาตุลม + หอก  ->   โอกาสไม้โดนโจมตี 20% ");
        System.out.println("ธาตุลม + โล่   ->   โอกาสไม้โดนโจมตี 5% \n");

        System.out.println("ธาตุดิน + ดาบ  ->   ลดความเสียหาย 5% ");
        System.out.println("ธาตุดิน + ธนู   ->   ลดความเสียหาย 5%");
        System.out.println("ธาตุดิน + หอก  ->   ลดความเสียหาย 5% ");
        System.out.println("ธาตุดิน + โล่   ->   ลดความเสียหาย 30% \n");
        
        System.out.print("\nName : ");
        String Name = kbd.next();
        System.out.println("\n            กรูณาเลือกธาตุ             ");
        System.out.println("1. ธาตุดิน");
        System.out.println("2. ธาตุน้ำ");
        System.out.println("3. ธาตุลม");
        System.out.println("4. ธาตุไฟ\n");
        System.out.print("Your Element : ");
        int Element = kbd.nextInt();
        System.out.println("            กรูณาเลือกอาวุธ             ");
        System.out.println("1. ดาบ");
        System.out.println("2. ธนู");
        System.out.println("3. หอก");
        System.out.println("4. โล่\n");
        System.out.print("Your Weapon : ");
        int Weapon = kbd.nextInt();
        if(Element == 1 && Weapon == 1){
            Sword_Earth player = new Sword_Earth(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.Defend(5.0);
        }
        else if(Element == 4 && Weapon == 1){
            Sword_Fire player = new Sword_Fire(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.attack(20.0);
        }
        else if(Element == 2 && Weapon == 1){
            Sword_Water player = new Sword_Water(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.attack(20);
        }
        else if(Element == 3 && Weapon == 1){
            Sword_Wind player = new Sword_Wind(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.miss(20.0);
        }
        else if(Element == 4 && Weapon == 2){
            Arrow_Fire player = new Arrow_Fire(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.attack(10.0);
        }
        else if(Element == 2 && Weapon == 2){
            Arrow_Water player = new Arrow_Water(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.attack(5);
        }
        else if(Element == 3 && Weapon == 2){
            Arrow_Wind player = new Arrow_Wind(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.miss(20.0);
        }
        else if(Element == 1 && Weapon == 2){
            Arrow_Earth player = new Arrow_Earth(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.Defend(5.0);
        }
        else if(Element == 1 && Weapon == 3){
            Spear_Earth player = new Spear_Earth(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.Defend(5.0);
        }
        else if(Element == 2 && Weapon == 3){
            Spear_Water player = new Spear_Water(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.attack(20);
        }
        else if(Element == 3 && Weapon == 3){
            Spear_Wind player = new Spear_Wind(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.miss(20.0);
        }
        else if(Element == 4 && Weapon == 3){
            Spear_Fire player = new Spear_Fire(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.attack(10.0);
        }
        else if(Element == 1 && Weapon == 4){
            Shield_Earth player = new Shield_Earth(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.Defend(5.0);
        }
        else if(Element == 2 && Weapon == 4){
            Shield_Water player = new Shield_Water(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.attack(5);
        }
        else if(Element == 3 && Weapon == 4){
            Shield_Wind player = new Shield_Wind(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.miss(5.0);
        }
        else if(Element == 4 && Weapon == 4){
            Shield_Fire player = new Shield_Fire(Name);
            player.ShowDetail();
            player_attack start = new player_attack(player.Name, player.HP, player.ATK, player.DEF);
            start.start();
            start.attack(5.0);
        }
        else{
            System.out.println("\nSomething wrong please try again\n");
        }
        kbd.close();
    }
}


abstract class Character{
    protected String Name;
    protected double HP;
    protected double ATK;
    protected double DEF;

    public void ShowDetail(){

    }
}

class Characters extends Character{


    Characters(String Name){
        this.Name = Name;
    }

    public void ShowDetail(){
        System.out.println("\n-------------------------------------------------------------------------------------\n");
        System.out.println("Name : " + this.Name);
        System.out.println("HP : " + this.HP);
        System.out.println("ATK : " + this.ATK);
        System.out.println("DEF : " + this.DEF);
    }
}

class Sword_Fire extends Characters{
    
    Sword_Fire(String name){
        super(name);
        this.HP = 1000;
        this.ATK = 180;
        this.DEF = 80;
    }

    public void ShowDetail(){
        super.ShowDetail();
        System.out.println("เพิ่มความเสียหาย 20% เรียบร้อย");        
    }
}

class Sword_Water extends Characters{
    // เพิ่มโอกาสดาเมจ * 2
    Sword_Water(String name){
        super(name);
        this.HP = 1000;
        this.ATK = 150;
        this.DEF = 80;
    }


    public void ShowDetail(){
        super.ShowDetail();     
        System.out.println("โอกาสความเสียหาย *2 20%");   
    }
}

class Sword_Wind extends Characters{
    // โอกาสตีพลาด 20%
    Sword_Wind(String name){
        super(name);
        this.HP = 1000;
        this.ATK = 150;
        this.DEF = 80;
    }


    public void ShowDetail(){
        super.ShowDetail();   
        System.out.println("โอกาสไม่โดนโจมตี 20%");     
    }
}

class Sword_Earth extends Characters{
    // ลดความเสียหาย 5%
    Sword_Earth(String name){
        super(name);
        this.HP = 1000;
        this.ATK = 150;
        this.DEF = 80;
    }


    public void ShowDetail(){
        super.ShowDetail();     
        System.out.println("ลดความเสียหาย 5%");   
    }
}

class Arrow_Fire extends Characters{
    
    Arrow_Fire(String name){
        super(name);
        this.HP = 850;
        this.ATK = 220;
        this.DEF = 60;
    }


    public void ShowDetail(){
        super.ShowDetail();   
        System.out.println("เพิ่มความเสียหาย 10% เรียบร้อย");     
    }
}

class Arrow_Water extends Characters{
    
    Arrow_Water(String name){
        super(name);
        this.HP = 850;
        this.ATK = 220;
        this.DEF = 60;
    }


    public void ShowDetail(){
        super.ShowDetail();   
        System.out.println("โอกาสความเสียหาย *2 5%");     
    }
}

class Arrow_Wind extends Characters{
    
    Arrow_Wind(String name){
        super(name);
        this.HP = 850;
        this.ATK = 210;
        this.DEF = 60;
    }


    public void ShowDetail(){
        super.ShowDetail(); 
        System.out.println("โอกาสความเสียหาย *2 20%");       
    }
}

class Arrow_Earth extends Characters{
    
    Arrow_Earth(String name){
        super(name);
        this.HP = 850;
        this.ATK = 220;
        this.DEF = 60;
    }


    public void ShowDetail(){
        super.ShowDetail();    
        System.out.println("ลดความเสียหาย 5 %");    
    }
}

class Spear_Fire extends Characters{
    
    Spear_Fire(String name){
        super(name);
        this.HP = 950;
        this.ATK = 176;
        this.DEF = 70;
    }


    public void ShowDetail(){
        super.ShowDetail();    
        System.out.println("เพิ่มความเสียหาย 10% เรียบร้อย");    
    }
}

class Spear_Water extends Characters{
    
    Spear_Water(String name){
        super(name);
        this.HP = 950;
        this.ATK = 176;
        this.DEF = 70;
    }


    public void ShowDetail(){
        super.ShowDetail();        
        System.out.println("โอกาสความเสียหาย *2 20%");
    }
}

class Spear_Wind extends Characters{
    
    Spear_Wind(String name){
        super(name);
        this.HP = 950;
        this.ATK = 176;
        this.DEF = 70;
    }


    public void ShowDetail(){
        super.ShowDetail();      
        System.out.println("โอกาสไม่โดนความเสียหาย 20%");  
    }
}

class Spear_Earth extends Characters{
    
    Spear_Earth(String name){
        super(name);
        this.HP = 950;
        this.ATK = 176;
        this.DEF = 70;
    }


    public void ShowDetail(){
        super.ShowDetail();        
        System.out.println("ลดความเสียหาย 5%");
    }
}

class Shield_Fire extends Characters{
    
    Shield_Fire(String name){
        super(name);
        this.HP = 1700;
        this.ATK = 84;
        this.DEF = 140;
    }


    public void ShowDetail(){
        super.ShowDetail();        
        System.out.println("เพิ่มความเสียหาย 5%");
    }
}

class Shield_Water extends Characters{
    
    Shield_Water(String name){
        super(name);
        this.HP = 1700;
        this.ATK = 80;
        this.DEF = 140;
    }


    public void ShowDetail(){
        super.ShowDetail();        
        System.out.println("โอกาสความเสียหาย *2 5%");
    }
}

class Shield_Wind extends Characters{
    
    Shield_Wind(String name){
        super(name);
        this.HP = 1700;
        this.ATK = 80;
        this.DEF = 140;
    }


    public void ShowDetail(){
        super.ShowDetail();    
        System.out.println("โอกาสไม่โดนโจมตี 5%");    
    }
}

class Shield_Earth extends Characters{
    
    Shield_Earth(String name){
        super(name);
        this.HP = 1700;
        this.ATK = 80;
        this.DEF = 140;
    }


    public void ShowDetail(){
        super.ShowDetail();   
        System.out.println("ลดความเสียหาย 30%");     
    }
}

interface position{
    void attack(double percent);
}

class player_attack implements position{

    protected String name;
    protected double HP;
    protected double ATK;
    protected double DEF;

    player_attack(String name , double HP , double ATK , double DEF ){
        this.name = name;
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
    }

    public void start(){
        System.out.println("\n---------- Game start!!!! ----------\n");
    }
    
    public void attack(double attack_percent){
        double hp_boss = 1000;
        while (hp_boss >= 0 || this.HP > 0){
            System.out.println(this.name + " Attack Boss " + this.ATK + " Damage " + "Boss HP : " + hp_boss);
            System.out.println( "Boss Attack " + this.name + " 150 damage " + this.name + " HP : " + this.HP + "\n");

            hp_boss = hp_boss - (this.ATK+(this.ATK*(attack_percent/100)));
            this.HP = this.HP - 150;
            if(this.HP <= 0){
                System.out.println("---------- Game Over ----------");
                break;
            }
            if (hp_boss <= 0){
                System.out.println("---------- You Win ----------");
                break;
            }
        }
    }


    // overloading
    public void attack(int doubleattack){
        double attack = doubleattack;
        double hp_boss = 1000;
        int r = (int) (Math.random() * (5 - 1)) + 1;
        while (hp_boss >= 0 || this.HP > 0) {
            if(r == 3){
                System.out.println(this.name + " Attack Boss " + this.ATK*2 + " Damage " + "Boss HP : " + hp_boss);
                System.out.println( "Boss Attack " + this.name + "150 damage " + this.name + " HP : " + this.HP + "\n");
                hp_boss = hp_boss - (this.ATK+(this.ATK*(attack/100)));
            }
            else{
                System.out.println(this.name + " Attack Boss " + this.ATK + " Damage " + "Boss HP : " + hp_boss);
                System.out.println( "Boss Attack " + this.name + " 150 damage " + this.name + " HP : " + this.HP + "\n");
            }
            hp_boss = hp_boss - (this.ATK+(this.ATK*(attack/100)));
            this.HP = this.HP - 150;

            if(this.HP <= 0){
                System.out.println("---------- Game Over ----------");
                break;
            }
            if (hp_boss <= 0){
                System.out.println("---------- You Win ----------");
                break;
            }
        }
    }


    public void Defend(double percent){
        double hp_boss = 1000;
        double hp = 150 -  (this.DEF + (this.DEF * (percent/100)));
        while (hp_boss >= 0 || this.HP > 0){
            System.out.println(this.name + " Attack Boss " + this.ATK + " Damage " + "Boss HP : " + hp_boss);
            System.out.println( "Boss Attack " + this.name +" " +  hp  + " damage " + this.name + " HP : " + this.HP + "\n");

            hp_boss = hp_boss - (this.ATK+(this.ATK*(percent/100)));
            this.HP = this.HP - hp;
            if(this.HP <= 0){
                System.out.println("---------- Game Over ----------");
                break;
            }
            if (hp_boss <= 0){
                System.out.println("---------- You Win ----------");
                break;
            }
        }
    }

    public void miss(double percent){
        double hp_boss = 1000;
        int r = (int) (Math.random() * (5 - 1)) + 1;
        while (hp_boss >= 0 || this.HP > 0){
            if(r == 3){
                System.out.println(this.name + " Attack Boss " + this.ATK*2 + " Damage " + "Boss HP : " + hp_boss);
                System.out.println(this.name + " Attack Boss " + this.ATK*2 + " Damage " + "Boss HP : " + hp_boss);
                hp_boss = hp_boss - (this.ATK+(this.ATK*(percent/100)));
            }
            else{
                System.out.println(this.name + " Attack Boss " + this.ATK + " Damage " + "Boss HP : " + hp_boss);
                System.out.println( "Boss Attack " + this.name + " 150 damage " + this.name + " HP : " + this.HP + "\n");
            }
            hp_boss = hp_boss - (this.ATK+(this.ATK*(percent/100)));
            this.HP = this.HP - 150;

            if(this.HP <= 0){
                System.out.println("---------- Game Over ----------");
                break;
            }
            if (hp_boss <= 0){
                System.out.println("---------- You Win ----------");
                break;
            }
        }
    }

}
