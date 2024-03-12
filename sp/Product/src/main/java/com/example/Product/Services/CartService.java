package com.example.Product.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Product.DTO.FakeStoreApi;

@Service
public class CartService {
    
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com/";

    public FakeStoreApi[] getAllCartItems() {
      FakeStoreApi[] response = restTemplate.getForObject(url + "carts", FakeStoreApi[].class);
      return response;
    }
    public FakeStoreApi getCartItem(Long id) {
      FakeStoreApi response = restTemplate.getForObject(url + "carts/" + id, FakeStoreApi.class);
      return response;
    }
    public FakeStoreApi getCartByUser(Long id) {
      FakeStoreApi response = restTemplate.getForObject(url + "carts/user/" + id, FakeStoreApi.class);
      return response;
    }
    public FakeStoreApi[] getCartsInRange(String startDate, String endDate) {
      FakeStoreApi[] response = restTemplate.getForObject(url + "carts?startdate=" + startDate + "&enddate=" + endDate, FakeStoreApi[].class);
      return response;
    }



    public FakeStoreApi updateCartItem(FakeStoreApi cart) {

      FakeStoreApi fetchCart = new FakeStoreApi();
      fetchCart.setId(cart.getId());
      fetchCart.setUserId(cart.getUserId());
      fetchCart.setDate(cart.getDate());
      fetchCart.setProducts(cart.getProducts());
      fetchCart.set__v(cart.get__v());
      
      FakeStoreApi response = restTemplate.patchForObject(url + "carts/" + cart.getId(), fetchCart, FakeStoreApi.class);
      return response;
     
    }

    public FakeStoreApi AddCartItem(FakeStoreApi cart){
      FakeStoreApi fetchCart = new FakeStoreApi();
      fetchCart.setId(cart.getId());
      fetchCart.setUserId(cart.getUserId());
      fetchCart.setDate(cart.getDate());
      fetchCart.setProducts(cart.getProducts());
      fetchCart.set__v(cart.get__v());
      
      FakeStoreApi response = restTemplate.postForObject(url + "carts/", fetchCart, FakeStoreApi.class);
      return response;
    }

    
    public void deleteCartItem(Long id){
        restTemplate.delete(url + "carts/" + id);
    }





}
