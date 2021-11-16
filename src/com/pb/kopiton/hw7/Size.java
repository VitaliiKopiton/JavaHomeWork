package com.pb.kopiton.hw7;

public enum Size {
    XXS ("xxs"),
     XS ("xs"),
      S ("s"),
      M ("m"),
      L ("l");

    public Enum (String description, String euroSize ) {
        description = description;
        euroSize = euroSize

    }

    public getDescription() {
            if (euroSize equals ('xxs') || euroSize equals ('XXS')) {
                return 'Детский размер';
                elso {}

            }

    }

    public int getEuroSize() {
        switch (euroSize) {
            case 'xxs':
                return 32;
                break;
            case 'xs':
                return 34;
                break;
            case 's':
                return 36;
                break;
            case 'm':
                return 38;
                break;
            case 'l':
                return 40;
                break;
        }
        default:
        System.out.println(euroSize + " - размер указан не верно");
    }

}
