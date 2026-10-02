package org.example;

public abstract class BaseProduct implements Product {

        private final String name;
        private final Size size;

        protected BaseProduct(String name, Size size) {
            this.name = name;
            this.size = size;
        }

        public String getName() {
            return name;
        }

        public Size getSize() {
            return size;
        }

        public String getDescription(){
            return getName();
        };

        public int getPrice(){
            return getBasePrice();
        }

        protected abstract int getBasePrice();

}
