/*
 * Copyright 2018 Baloise Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baloise.open.template;

/**
 * @author Markus Tiede
 */
public class App {

    /**
     * @param args
     *
     */


    public static void main(String[] args) {
        Husky husky = new Husky(); //Defaultverhalten
        husky.bellen(); //ganz leise bellen...
        husky.setBellVerhalten(new LautBellen()); //Verhalten dynamisch setzen
        husky.bellen(); //GANZ LAUT BELLEN!!!
    }
}
class NormalLaufen implements LaufVerhalten{
    public void laufen() {
        System.out.println("Normal laufen.");
    }
}

class SchnellLaufen implements LaufVerhalten {
    public void laufen() {
        System.out.println("Schnell laufen.");
    }
}

class KannNichtLaufen implements LaufVerhalten{
    public void laufen() {
        System.out.println("Kann doch gar nicht laufen.");
    }
}

class Humpeln implements LaufVerhalten{
    public void laufen() {
        System.out.println("Humpeln.");
    }
}

class LeiseBellen implements BellVerhalten {
    public void bellen() {
        System.out.println("ganz leise bellen...");
    }
}

class LautBellen implements BellVerhalten{
    public void bellen() {
        System.out.println("GANZ LAUT BELLEN!!");
    }
}

class ElektronischBellen implements BellVerhalten {
    public void bellen() {
        System.out.println("Elekkkkktronisch Bellen!");
    }
}



