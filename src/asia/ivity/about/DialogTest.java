package asia.ivity.about;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * About Dialog test activity.
 *
 * @author Sebastian Roth <sebastian.roth@gmail.com>
 */
public class DialogTest extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.act_main);
    }

    public void doAbout(View view) {
        AboutDialog dlg = new AboutDialog(this);

        dlg.setCopyright("(c) 2011 Ivity Asia");
        dlg.setLine1("Feedback to: \n info@ivity.asia");
        dlg.setLine2("Supported by: http://www.android.com");

        dlg.show();
    }
}