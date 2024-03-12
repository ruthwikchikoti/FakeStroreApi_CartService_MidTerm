package com.example.Product.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.DTO.FakeStoreApi;
import com.example.Product.Services.CartService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class CartContoller {
    
    CartService CartService;
    public CartContoller(CartService CartService) {
        this.CartService = CartService;
    }
    @GetMapping("/carts/")
    public FakeStoreApi[] getAllCartItems(){
        return CartService.getAllCartItems();
    }
    
   @GetMapping("/carts/{id}/")
   public FakeStoreApi getCartItem(@PathVariable Long id){
       return CartService.getCartItem(id);
   }    

   @GetMapping("/carts/user/{id}/")
   public FakeStoreApi getCartByUser(@PathVariable Long id){
       return CartService.getCartItem(id);
   }
   @GetMapping("/carts/range/")
    public FakeStoreApi[] getCartsInRange(@RequestParam("startdate") String startDate, @RequestParam("enddate") String endDate){
        return CartService.getCartsInRange(startDate, endDate);
    }

    @PutMapping("/carts/update/{id}/")
    public FakeStoreApi updateCartItem(@RequestBody FakeStoreApi cart){
        return CartService.updateCartItem(cart);
    }
    @DeleteMapping("/carts/delete/{id}/")
    public String deleteCartItem(@PathVariable Long id){
        CartService.deleteCartItem(id);
        return "Your Product has been deleted from the cart";
    }

    
    @RequestMapping("/carts/Add/")
    public FakeStoreApi AddCartItem(@RequestBody FakeStoreApi cart){
        return CartService.AddCartItem(cart);
    }

 
}

