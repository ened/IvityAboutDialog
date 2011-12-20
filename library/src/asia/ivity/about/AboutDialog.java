package asia.ivity.about;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

/**
 * About Dialog (simple).
 *
 * @author Sebastian Roth <sebastian.roth@gmail.com>
 */
public final class AboutDialog extends Dialog {

    static final String IVITY_HOME = "http://www.ivity.asia";

    /** {@inheritDoc} */
    public AboutDialog(Context context) {
        super(context, R.style.TitleLessDialog);

        setContentView(R.layout.dlg_about);

        findViewById(R.id.iv_ivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(IVITY_HOME));
                getContext().startActivity(browserIntent);
            }
        });
    }

    public void setCopyright(String copyright) {
        ((TextView) findViewById(R.id.tv_copyright)).setText(copyright);
    }

    public void setLine1(String text) {
        TextView textView = (TextView) findViewById(R.id.txt_line1);
        textView.setText(text);
        textView.setVisibility(View.VISIBLE);
        Linkify.addLinks(textView, Linkify.ALL);
    }

    public void setLine2(String text) {
        TextView textView = (TextView) findViewById(R.id.txt_line2);
        textView.setText(text);
        textView.setVisibility(View.VISIBLE);
        Linkify.addLinks(textView, Linkify.ALL);
    }
}