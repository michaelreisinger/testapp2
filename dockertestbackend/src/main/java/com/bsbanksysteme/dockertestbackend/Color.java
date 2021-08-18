package com.bsbanksysteme.dockertestbackend;

public enum Color {
    RED {
      @Override
      public String toString() {
          return "#eb4034";
      }
    },
    BLUE {
        @Override
        public String toString() {
            return "#25227d";
        }
    },
    GREEN {
        @Override
        public String toString() {
            return "#44a637";
        }
    },
    YELLOW {
        @Override
        public String toString() {
            return "#a6a037";
        }
    },
    ORANGE {
        @Override
        public String toString() {
            return "#d18636";
        }
    },
    PURPLE {
        @Override
        public String toString() {
            return "#7d2278";
        }
    },
    BROWN{
        @Override
        public String toString() {
            return "#997471";
        }
    }
}
