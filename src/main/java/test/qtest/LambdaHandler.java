package test.qtest;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LambdaHandler implements RequestHandler<Map<String, Object>, Map<String, Object>> {

  @SuppressWarnings("unused")
  @Override
  public Map<String, Object> handleRequest(final Map<String, Object> input, final Context context) {
    // TODO Auto-generated method stub
    return null;
  }

}
