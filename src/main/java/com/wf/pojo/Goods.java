package com.wf.pojo;

public class Goods {
    private int id;
    private String name;
    private Double price;
    private String number;
    private int inventory;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", number='" + number + '\'' +
                ", inventory=" + inventory +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public Goods(int id, String name, Double price, String number, int inventory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.inventory = inventory;
    }

    public Goods() {
    }



//    @RequestMapping("/")
//    public String userForm(Model model) {
//        model.addAttribute("goods", new Goods());
//        return "goodsForm"; // 返回显示表单的视图名
//    }
//    @PostMapping("/submitUser")
//    public void submitUser(@ModelAttribute Goods goods, Model model) {
//        // 这里可以处理用户数据，比如保存到数据库等
//        System.out.println("Received goods: " + goods.getId() + ", Name: " + goods.getName());
//    }
}
