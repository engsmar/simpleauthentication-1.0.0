# DefaultApi

All URIs are relative to *https://virtserver.swaggerhub.com/CAC1/SimpleAuthentication/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](DefaultApi.md#authenticate) | **POST** /authenticate | Authenticates, via username and password
[**checkEdit**](DefaultApi.md#checkEdit) | **GET** /checkEdit | Checks if user able to edit
[**checkValidation**](DefaultApi.md#checkValidation) | **GET** /checkValidation | Checks if user able to validatte

<a name="authenticate"></a>
# **authenticate**
> authenticate(username, password)

Authenticates, via username and password

Authenticates, via username and password

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String username = "username_example"; // String | user name
String password = "password_example"; // String | passwrod
try {
    apiInstance.authenticate(username, password);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#authenticate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| user name |
 **password** | **String**| passwrod |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="checkEdit"></a>
# **checkEdit**
> InlineResponse200 checkEdit(userName)

Checks if user able to edit

Returns 1 if user can edit, else 0 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userName = "userName_example"; // String | user name to check if edit allowed for
try {
    InlineResponse200 result = apiInstance.checkEdit(userName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#checkEdit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**| user name to check if edit allowed for |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="checkValidation"></a>
# **checkValidation**
> InlineResponse200 checkValidation(userName)

Checks if user able to validatte

Returns 1 if user can validate, else 0 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userName = "userName_example"; // String | user name to check if validation allowed for
try {
    InlineResponse200 result = apiInstance.checkValidation(userName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#checkValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**| user name to check if validation allowed for |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

