package com.uptodown.activities;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import c7.n;
import com.uptodown.R;
import com.uptodown.activities.InformationActivity;
import g5.s;
import java.util.List;
import k5.o;
import o4.b0;
import o4.f0;
import o4.i3;
import s4.c;
import y7.e;
import y7.g;
import y7.j;
import z7.l;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class InformationActivity extends b0 {
    public static final /* synthetic */ int P = 0;
    public final n O = new n(new f0(this, 5));

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5589a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            w0().f5590b.setNavigationIcon(drawable);
            w0().f5590b.setNavigationContentDescription(getString(R.string.back));
        }
        final int i = 0;
        w0().f5590b.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: o4.i1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InformationActivity f8742b;

            {
                this.f8742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                InformationActivity informationActivity = this.f8742b;
                switch (i3) {
                    case 0:
                        int i8 = InformationActivity.P;
                        informationActivity.finish();
                        return;
                    default:
                        int i10 = InformationActivity.P;
                        String string = informationActivity.getString(R.string.url_dev_on_board);
                        string.getClass();
                        String string2 = informationActivity.getString(R.string.support_title);
                        string2.getClass();
                        w5.c.e(informationActivity, string, string2);
                        return;
                }
            }
        });
        w0().r.setTypeface(c.u);
        w0().l.setTypeface(c.v);
        w0().m.setTypeface(c.v);
        w0().f5591n.setTypeface(c.v);
        w0().p.setTypeface(c.v);
        w0().q.setTypeface(c.v);
        w0().o.setTypeface(c.v);
        TextView textView = w0().o;
        String string = getString(R.string.information_activity_dev_on_board_more_info);
        string.getClass();
        List<o> a02 = j.a0(new e((g) l.a(new l("\\[a](.*?)\\[/a]"), string), (q7.c) new k5.l(0)));
        final int i3 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new l("\\[a](.*?)\\[/a]").b(string, new k5.l(1)));
        for (o oVar : a02) {
            int q02 = z7.n.q0(spannableStringBuilder, oVar.f7459d, 0, false, 6);
            int length = oVar.f7459d.length() + q02;
            if (q02 >= 0) {
                spannableStringBuilder.setSpan(new i3(this, 2), q02, length, 33);
            }
        }
        textView.setText(spannableStringBuilder);
        w0().o.setOnClickListener(new View.OnClickListener(this) { // from class: o4.i1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InformationActivity f8742b;

            {
                this.f8742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                InformationActivity informationActivity = this.f8742b;
                switch (i32) {
                    case 0:
                        int i8 = InformationActivity.P;
                        informationActivity.finish();
                        return;
                    default:
                        int i10 = InformationActivity.P;
                        String string2 = informationActivity.getString(R.string.url_dev_on_board);
                        string2.getClass();
                        String string22 = informationActivity.getString(R.string.support_title);
                        string22.getClass();
                        w5.c.e(informationActivity, string2, string22);
                        return;
                }
            }
        });
    }

    public final s w0() {
        return (s) this.O.getValue();
    }
}
