package com.madrun.icampapp;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by MadhuRima on 24-05-2017.
 */

public interface RestApi {
    @GET("/api/1/databases/mydb/collections/Students/")
    Call<UserProfileResponse> getUserProfile(@Query("apikey")String key);

//
//    @POST("oauth/token")
//    Call<OathResponse> getToken(@Body OauthRequest oauthRequest);

//    @GET("api/customer")
//    Call<CustomerResponse> getCustomer(@Query("filter") String filter, @Query("page") int page);
//
//    @GET("api/company/?dealership=1")
//    Call<CompanyResponse> getCompany(@Query("page") int page);
//
//    @GET("api/company/?dealership=1")
//    Call<CompanyResponse> getCompany(@Query("q") String query);
//
//
//    @GET("api/product")
//    Call<CatalogsResponse> getCatalog(@Query("q") String query);
//
//    @GET("api/product")
//    Call<CatalogsResponse> getCatalog(@Query("q") String query, @Query("type") String type);

}
