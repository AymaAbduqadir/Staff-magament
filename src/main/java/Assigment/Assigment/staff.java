package Assigment.Assigment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class staff {
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Staff {
        private Long id;
        private String name;
        private String position;

        public void setId(Long aLong) {
        }

        public Long getId() {
            return  id;
        }
    }
}

