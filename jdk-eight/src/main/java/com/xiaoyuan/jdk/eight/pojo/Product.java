package com.xiaoyuan.jdk.eight.pojo;

import java.util.Objects;

public class Product {


    private Integer id;

    private Integer count;

    public Product() {
    }

    public Product(Integer id, Integer count) {
        this.id = id;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(getId(), product.getId()) &&
                Objects.equals(getCount(), product.getCount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCount());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", count=" + count +
                '}';
    }
}
