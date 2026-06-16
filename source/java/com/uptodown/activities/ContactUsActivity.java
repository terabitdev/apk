package com.uptodown.activities;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.compose.foundation.style.c;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import c7.n;
import com.uptodown.R;
import com.uptodown.activities.ContactUsActivity;
import g5.g;
import o4.b0;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class ContactUsActivity extends b0 {
    public static final /* synthetic */ int Q = 0;
    public final n O = new n(new c(this, 29));
    public boolean P;

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5462a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            w0().f5464n.setNavigationIcon(drawable);
            w0().f5464n.setNavigationContentDescription(getString(R.string.back));
        }
        final int i = 0;
        w0().f5464n.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: o4.c0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactUsActivity f8555b;

            {
                this.f8555b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                ContactUsActivity contactUsActivity = this.f8555b;
                switch (i3) {
                    case 0:
                        int i8 = ContactUsActivity.Q;
                        contactUsActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    default:
                        if (!contactUsActivity.P) {
                            contactUsActivity.w0().m.setVisibility(0);
                            contactUsActivity.P = true;
                            Editable text = contactUsActivity.w0().f5463b.getText();
                            if (text != null && text.length() != 0) {
                                Editable text2 = contactUsActivity.w0().l.getText();
                                if (text2 != null && text2.length() != 0) {
                                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(contactUsActivity);
                                    j8.e eVar = c8.p0.f3588a;
                                    c8.f0.z(lifecycleScope, j8.d.f7053a, null, new a5.h(contactUsActivity, (g7.c) null, 22), 2);
                                    return;
                                }
                                String string = contactUsActivity.getString(R.string.falta_texto_sugerencia);
                                string.getClass();
                                contactUsActivity.A(string);
                            } else {
                                String string2 = contactUsActivity.getString(R.string.falta_email_sugerencia);
                                string2.getClass();
                                contactUsActivity.A(string2);
                            }
                            contactUsActivity.P = false;
                            contactUsActivity.w0().m.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        });
        w0().p.setTypeface(s4.c.u);
        w0().f5463b.setTypeface(s4.c.v);
        w0().f5463b.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: o4.d0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactUsActivity f8584b;

            {
                this.f8584b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                int i3 = i;
                ContactUsActivity contactUsActivity = this.f8584b;
                switch (i3) {
                    case 0:
                        int i8 = ContactUsActivity.Q;
                        if (z10) {
                            contactUsActivity.w0().f5463b.setHint("");
                            return;
                        } else {
                            contactUsActivity.w0().f5463b.setHint(contactUsActivity.getString(R.string.hint_email_registro));
                            return;
                        }
                    default:
                        int i10 = ContactUsActivity.Q;
                        if (z10) {
                            contactUsActivity.w0().l.setHint("");
                            return;
                        } else {
                            contactUsActivity.w0().l.setHint(contactUsActivity.getString(R.string.hint_text_suggestion));
                            return;
                        }
                }
            }
        });
        w0().l.setTypeface(s4.c.v);
        final int i3 = 1;
        w0().l.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: o4.d0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactUsActivity f8584b;

            {
                this.f8584b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                int i32 = i3;
                ContactUsActivity contactUsActivity = this.f8584b;
                switch (i32) {
                    case 0:
                        int i8 = ContactUsActivity.Q;
                        if (z10) {
                            contactUsActivity.w0().f5463b.setHint("");
                            return;
                        } else {
                            contactUsActivity.w0().f5463b.setHint(contactUsActivity.getString(R.string.hint_email_registro));
                            return;
                        }
                    default:
                        int i10 = ContactUsActivity.Q;
                        if (z10) {
                            contactUsActivity.w0().l.setHint("");
                            return;
                        } else {
                            contactUsActivity.w0().l.setHint(contactUsActivity.getString(R.string.hint_text_suggestion));
                            return;
                        }
                }
            }
        });
        w0().o.setTypeface(s4.c.u);
        w0().o.setOnClickListener(new View.OnClickListener(this) { // from class: o4.c0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactUsActivity f8555b;

            {
                this.f8555b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                ContactUsActivity contactUsActivity = this.f8555b;
                switch (i32) {
                    case 0:
                        int i8 = ContactUsActivity.Q;
                        contactUsActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    default:
                        if (!contactUsActivity.P) {
                            contactUsActivity.w0().m.setVisibility(0);
                            contactUsActivity.P = true;
                            Editable text = contactUsActivity.w0().f5463b.getText();
                            if (text != null && text.length() != 0) {
                                Editable text2 = contactUsActivity.w0().l.getText();
                                if (text2 != null && text2.length() != 0) {
                                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(contactUsActivity);
                                    j8.e eVar = c8.p0.f3588a;
                                    c8.f0.z(lifecycleScope, j8.d.f7053a, null, new a5.h(contactUsActivity, (g7.c) null, 22), 2);
                                    return;
                                }
                                String string = contactUsActivity.getString(R.string.falta_texto_sugerencia);
                                string.getClass();
                                contactUsActivity.A(string);
                            } else {
                                String string2 = contactUsActivity.getString(R.string.falta_email_sugerencia);
                                string2.getClass();
                                contactUsActivity.A(string2);
                            }
                            contactUsActivity.P = false;
                            contactUsActivity.w0().m.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final g w0() {
        return (g) this.O.getValue();
    }
}
