package com.uptodown.activities;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import c7.n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.GdprPrivacySettings;
import g5.k1;
import n4.e;
import o4.b0;
import o4.f0;
import o4.g1;
import s4.c;
import s7.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class GdprPrivacySettings extends b0 {
    public static final /* synthetic */ int P = 0;
    public final n O = new n(new f0(this, 4));

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5517a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        final int i = 0;
        w0().f5518b.setOnClickListener(new g1(this, i));
        w0().f5522y.setTypeface(c.u);
        w0().E.setTypeface(c.u);
        w0().r.setTypeface(c.v);
        w0().B.setTypeface(c.u);
        w0().v.setTypeface(c.v);
        w0().A.setTypeface(c.u);
        w0().u.setTypeface(c.v);
        w0().C.setTypeface(c.u);
        w0().f5520w.setTypeface(c.v);
        w0().f5523z.setTypeface(c.u);
        w0().t.setTypeface(c.v);
        w0().D.setTypeface(c.u);
        w0().f5521x.setTypeface(c.v);
        w0().q.setTypeface(c.u);
        w0().s.setTypeface(c.u);
        w0().F.setText("⚠ " + getString(R.string.tracking_disabled_warning_gdpr) + " ⚠");
        w0().F.setTypeface(c.v);
        w0().f5519n.setChecked(a.v(this, "gdpr_analytics_allowed", false));
        w0().p.setChecked(a.v(this, "gdpr_crashlytics_allowed", false));
        w0().o.setChecked(a.v(this, "gdpr_tracking_allowed", false));
        final int i3 = 1;
        if (a.v(this, "gdpr_requested", false)) {
            z0(w0().f5519n, w0().u, w0().f5519n.isChecked());
            z0(w0().p, w0().f5520w, w0().p.isChecked());
            z0(w0().o, w0().v, w0().o.isChecked());
        } else {
            z0(w0().f5519n, w0().u, true);
            z0(w0().p, w0().f5520w, true);
            z0(w0().o, w0().v, true);
            w0().f5519n.setChecked(true);
            w0().p.setChecked(true);
            w0().o.setChecked(true);
        }
        if (!w0().o.isChecked()) {
            w0().F.setVisibility(0);
        } else {
            w0().F.setVisibility(8);
        }
        w0().f5519n.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: o4.h1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GdprPrivacySettings f8717b;

            {
                this.f8717b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                int i8 = i;
                GdprPrivacySettings gdprPrivacySettings = this.f8717b;
                switch (i8) {
                    case 0:
                        int i10 = GdprPrivacySettings.P;
                        gdprPrivacySettings.z0(gdprPrivacySettings.w0().f5519n, gdprPrivacySettings.w0().u, z10);
                        gdprPrivacySettings.y0();
                        return;
                    case 1:
                        int i11 = GdprPrivacySettings.P;
                        gdprPrivacySettings.z0(gdprPrivacySettings.w0().p, gdprPrivacySettings.w0().f5520w, z10);
                        gdprPrivacySettings.y0();
                        return;
                    default:
                        int i12 = GdprPrivacySettings.P;
                        gdprPrivacySettings.z0(gdprPrivacySettings.w0().o, gdprPrivacySettings.w0().v, z10);
                        gdprPrivacySettings.y0();
                        if (!gdprPrivacySettings.w0().o.isChecked()) {
                            gdprPrivacySettings.w0().F.setVisibility(0);
                            return;
                        } else {
                            gdprPrivacySettings.w0().F.setVisibility(8);
                            return;
                        }
                }
            }
        });
        w0().p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: o4.h1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GdprPrivacySettings f8717b;

            {
                this.f8717b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                int i8 = i3;
                GdprPrivacySettings gdprPrivacySettings = this.f8717b;
                switch (i8) {
                    case 0:
                        int i10 = GdprPrivacySettings.P;
                        gdprPrivacySettings.z0(gdprPrivacySettings.w0().f5519n, gdprPrivacySettings.w0().u, z10);
                        gdprPrivacySettings.y0();
                        return;
                    case 1:
                        int i11 = GdprPrivacySettings.P;
                        gdprPrivacySettings.z0(gdprPrivacySettings.w0().p, gdprPrivacySettings.w0().f5520w, z10);
                        gdprPrivacySettings.y0();
                        return;
                    default:
                        int i12 = GdprPrivacySettings.P;
                        gdprPrivacySettings.z0(gdprPrivacySettings.w0().o, gdprPrivacySettings.w0().v, z10);
                        gdprPrivacySettings.y0();
                        if (!gdprPrivacySettings.w0().o.isChecked()) {
                            gdprPrivacySettings.w0().F.setVisibility(0);
                            return;
                        } else {
                            gdprPrivacySettings.w0().F.setVisibility(8);
                            return;
                        }
                }
            }
        });
        w0().l.setOnClickListener(new g1(this, i3));
        final int i8 = 2;
        w0().o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: o4.h1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GdprPrivacySettings f8717b;

            {
                this.f8717b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                int i82 = i8;
                GdprPrivacySettings gdprPrivacySettings = this.f8717b;
                switch (i82) {
                    case 0:
                        int i10 = GdprPrivacySettings.P;
                        gdprPrivacySettings.z0(gdprPrivacySettings.w0().f5519n, gdprPrivacySettings.w0().u, z10);
                        gdprPrivacySettings.y0();
                        return;
                    case 1:
                        int i11 = GdprPrivacySettings.P;
                        gdprPrivacySettings.z0(gdprPrivacySettings.w0().p, gdprPrivacySettings.w0().f5520w, z10);
                        gdprPrivacySettings.y0();
                        return;
                    default:
                        int i12 = GdprPrivacySettings.P;
                        gdprPrivacySettings.z0(gdprPrivacySettings.w0().o, gdprPrivacySettings.w0().v, z10);
                        gdprPrivacySettings.y0();
                        if (!gdprPrivacySettings.w0().o.isChecked()) {
                            gdprPrivacySettings.w0().F.setVisibility(0);
                            return;
                        } else {
                            gdprPrivacySettings.w0().F.setVisibility(8);
                            return;
                        }
                }
            }
        });
        w0().m.setOnClickListener(new g1(this, i8));
        w0().q.setOnClickListener(new g1(this, 3));
        w0().s.setOnClickListener(new g1(this, 4));
    }

    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!a.v(this, "gdpr_requested", false)) {
            a.M(this, "gdpr_requested", true);
            a.M(this, "gdpr_analytics_allowed", true);
            a.M(this, "gdpr_crashlytics_allowed", true);
            a.M(this, "gdpr_tracking_allowed", true);
        }
    }

    public final k1 w0() {
        return (k1) this.O.getValue();
    }

    public final void x0() {
        boolean isChecked = w0().p.isChecked();
        if (a.v(this, "gdpr_crashlytics_allowed", false) != isChecked) {
            a.M(this, "gdpr_crashlytics_allowed", isChecked);
        }
        boolean isChecked2 = w0().f5519n.isChecked();
        if (a.v(this, "gdpr_analytics_allowed", false) != isChecked2) {
            a.M(this, "gdpr_analytics_allowed", isChecked2);
        }
        boolean isChecked3 = w0().o.isChecked();
        if (a.v(this, "gdpr_tracking_allowed", false) != isChecked3) {
            a.M(this, "gdpr_tracking_allowed", isChecked3);
        }
        if (a.v(this, "gdpr_tracking_allowed", false)) {
            float f7 = UptodownApp.G;
            e.D(this);
            setResult(-1);
            return;
        }
        setResult(0);
    }

    public final void y0() {
        if (w0().s.getVisibility() == 0) {
            w0().q.setText(R.string.save);
            w0().q.setOnClickListener(new g1(this, 5));
            w0().s.setVisibility(8);
        }
    }

    public final void z0(SwitchCompat switchCompat, TextView textView, boolean z10) {
        if (z10) {
            switchCompat.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
            textView.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
        } else {
            switchCompat.setTextColor(ContextCompat.getColor(this, R.color.main_light_grey));
            textView.setTextColor(ContextCompat.getColor(this, R.color.main_light_grey));
        }
    }
}
