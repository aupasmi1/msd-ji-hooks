import com.mincom.ellipse.common.CoreErrorCodes
import com.mincom.ellipse.hook.hooks.CoreServiceHook
import com.mincom.ellipse.types.m1000.instances.PreferencesDTO
import com.mincom.ellipse.types.m1000.instances.PreferencesServiceResult
import com.mincom.ellipse.errors.Error;

class PreferencesService_update extends CoreServiceHook {

    /**
     * Custom logic to be executed before the standard service logic
     *
     * Store current value, execute additional validation and override data to be passed to the standard service.
     * @param input the DTO passed from the caller
     * @return null if the standard service should be executed, non-null if the service has been overridden and the return value should be returned to the caller.
     */
    @Override
    public Object onPreExecute(Object input) {
		System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
        log.info("In PreferencesService_update onPreExecute")

        return null;
    }

}