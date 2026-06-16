package com.uptodown.activities;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.viewbinding.ViewBindings;
import c7.n;
import c8.c0;
import c8.f0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.VirusTotalReport;
import f8.l1;
import g5.i1;
import g5.s0;
import h5.o;
import j$.util.concurrent.ConcurrentHashMap;
import j8.d;
import java.util.ArrayList;
import java.util.Iterator;
import k5.e;
import k5.f2;
import k5.g;
import k5.g1;
import kotlin.jvm.internal.i0;
import m4.a0;
import m4.e0;
import o2.a;
import o4.b0;
import o4.ec;
import o4.g6;
import o4.rc;
import o4.tc;
import o4.uc;
import o4.vc;
import o4.wc;
import s4.c;
import w5.q;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class VirusTotalReport extends b0 {
    public static final /* synthetic */ int Q = 0;
    public final n O = new n(new ec(this, 2));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(wc.class), new uc(this, 0), new tc(this), new uc(this, 1));

    public final void A0() {
        View inflate = getLayoutInflater().inflate(R.layout.virus_total_report_not_available, (ViewGroup) null, false);
        int i = R.id.iv_vt_not_available;
        if (((ImageView) ViewBindings.findChildViewById(inflate, R.id.iv_vt_not_available)) != null) {
            i = R.id.ll_vt_not_available_origin;
            if (((LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_vt_not_available_origin)) != null) {
                i = R.id.ll_vt_not_available_review;
                if (((LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_vt_not_available_review)) != null) {
                    i = R.id.ll_vt_not_available_scan;
                    if (((LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_vt_not_available_scan)) != null) {
                        i = R.id.tv_vt_not_available_about;
                        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_not_available_about);
                        if (textView != null) {
                            i = R.id.tv_vt_not_available_origin;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_not_available_origin);
                            if (textView2 != null) {
                                i = R.id.tv_vt_not_available_review;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_not_available_review);
                                if (textView3 != null) {
                                    i = R.id.tv_vt_not_available_scan;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_not_available_scan);
                                    if (textView4 != null) {
                                        i = R.id.tv_vt_not_available_subtitle;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_not_available_subtitle);
                                        if (textView5 != null) {
                                            i = R.id.tv_vt_not_available_title;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_not_available_title);
                                            if (textView6 != null) {
                                                textView6.setTypeface(c.u);
                                                textView5.setTypeface(c.v);
                                                textView.setTypeface(c.v);
                                                textView3.setTypeface(c.v);
                                                textView2.setTypeface(c.v);
                                                textView4.setTypeface(c.v);
                                                w0().q.addView((LinearLayout) inflate);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a.h("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void B0(f2 f2Var) {
        View inflate = getLayoutInflater().inflate(R.layout.virus_total_report_safe, (ViewGroup) null, false);
        int i = R.id.flow_vt_safe_items;
        if (((Flow) ViewBindings.findChildViewById(inflate, R.id.flow_vt_safe_items)) != null) {
            i = R.id.iv_vt_safe;
            if (((ImageView) ViewBindings.findChildViewById(inflate, R.id.iv_vt_safe)) != null) {
                i = R.id.ll_vt_safe_malware;
                if (((LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_vt_safe_malware)) != null) {
                    i = R.id.ll_vt_safe_spyware;
                    if (((LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_vt_safe_spyware)) != null) {
                        i = R.id.ll_vt_safe_virus;
                        if (((LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_vt_safe_virus)) != null) {
                            i = R.id.tv_vt_safe_certified;
                            TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_safe_certified);
                            if (textView != null) {
                                i = R.id.tv_vt_safe_latest_scan_title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_safe_latest_scan_title);
                                if (textView2 != null) {
                                    i = R.id.tv_vt_safe_malware;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_safe_malware);
                                    if (textView3 != null) {
                                        i = R.id.tv_vt_safe_spyware;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_safe_spyware);
                                        if (textView4 != null) {
                                            i = R.id.tv_vt_safe_subtitle;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_safe_subtitle);
                                            if (textView5 != null) {
                                                i = R.id.tv_vt_safe_title;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_safe_title);
                                                if (textView6 != null) {
                                                    i = R.id.tv_vt_safe_virus;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_safe_virus);
                                                    if (textView7 != null) {
                                                        LinearLayout linearLayout = (LinearLayout) inflate;
                                                        textView6.setTypeface(c.u);
                                                        textView5.setTypeface(c.v);
                                                        textView2.setTypeface(c.v);
                                                        textView.setTypeface(c.v);
                                                        textView7.setTypeface(c.u);
                                                        textView4.setTypeface(c.u);
                                                        textView3.setTypeface(c.u);
                                                        int i3 = f2Var.l;
                                                        if (i3 > 0) {
                                                            textView5.setText(getString(R.string.vt_report_safe_subtitle, String.valueOf(i3)));
                                                        } else {
                                                            textView5.setVisibility(8);
                                                        }
                                                        textView2.setText(getString(R.string.virustotal_report_previous_scan, f2Var.f7355n));
                                                        w0().q.addView(linearLayout);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a.h("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void C0(f2 f2Var) {
        Object obj;
        Object obj2 = null;
        View inflate = getLayoutInflater().inflate(R.layout.virus_total_report_warning, (ViewGroup) null, false);
        int i = R.id.iv_vt_warning;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.iv_vt_warning);
        if (imageView != null) {
            i = R.id.ll_vt_warning_positives;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_vt_warning_positives);
            if (linearLayout != null) {
                i = R.id.rl_vt_warning_header;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(inflate, R.id.rl_vt_warning_header);
                if (relativeLayout != null) {
                    i = R.id.tv_vt_warning_about;
                    TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_warning_about);
                    if (textView != null) {
                        i = R.id.tv_vt_warning_latest_scan_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_warning_latest_scan_title);
                        if (textView2 != null) {
                            i = R.id.tv_vt_warning_subtitle;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_warning_subtitle);
                            if (textView3 != null) {
                                i = R.id.tv_vt_warning_title;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_vt_warning_title);
                                if (textView4 != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) inflate;
                                    textView4.setTypeface(c.u);
                                    textView3.setTypeface(c.v);
                                    textView2.setTypeface(c.v);
                                    textView.setTypeface(c.v);
                                    textView3.setText(getString(R.string.vt_report_warning_subtitle, String.valueOf(f2Var.m), String.valueOf(f2Var.l)));
                                    textView2.setText(getString(R.string.virustotal_report_previous_scan, f2Var.f7355n));
                                    ArrayList arrayList = f2Var.o;
                                    if (arrayList != null && !arrayList.isEmpty()) {
                                        ArrayList arrayList2 = f2Var.o;
                                        arrayList2.getClass();
                                        int size = arrayList2.size();
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 < size) {
                                                obj = arrayList2.get(i3);
                                                i3++;
                                                g1 g1Var = (g1) obj;
                                                if (g1Var.l == 0 && g1Var.m == 0) {
                                                    break;
                                                }
                                            } else {
                                                obj = null;
                                                break;
                                            }
                                        }
                                        if (obj != null) {
                                            relativeLayout.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_bg_virustotal_warning_red));
                                            imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_vt_report_warning_red));
                                        }
                                        ArrayList arrayList3 = f2Var.o;
                                        arrayList3.getClass();
                                        int size2 = arrayList3.size();
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 >= size2) {
                                                break;
                                            }
                                            Object obj3 = arrayList3.get(i8);
                                            i8++;
                                            if (((g1) obj3).m == 1) {
                                                obj2 = obj3;
                                                break;
                                            }
                                        }
                                        if (obj2 == null) {
                                            textView.setVisibility(8);
                                        }
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams.setMargins((int) getResources().getDimension(R.dimen.margin_s), (int) getResources().getDimension(R.dimen.margin_m), 0, 0);
                                        Iterator it = f2Var.o.iterator();
                                        it.getClass();
                                        while (it.hasNext()) {
                                            Object next = it.next();
                                            next.getClass();
                                            g1 g1Var2 = (g1) next;
                                            s0 a10 = s0.a(getLayoutInflater());
                                            TextView textView5 = a10.l;
                                            TextView textView6 = a10.m;
                                            RelativeLayout relativeLayout2 = a10.f5593b;
                                            TextView textView7 = a10.f5594n;
                                            relativeLayout2.setLayoutParams(layoutParams);
                                            textView6.setTypeface(c.u);
                                            textView6.setText(g1Var2.f7388b);
                                            textView5.setTypeface(c.v);
                                            textView5.setText(g1Var2.f7387a);
                                            textView7.setTypeface(c.u);
                                            if (g1Var2.l == 1) {
                                                textView7.setText(getString(R.string.pup));
                                            } else if (g1Var2.m == 1) {
                                                textView7.setText(getString(R.string.adware));
                                            } else {
                                                a10.o.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_circular_red));
                                                textView7.setText(getString(R.string.malware));
                                                textView7.setTextColor(ContextCompat.getColor(this, R.color.white));
                                                textView7.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_bg_accent_red));
                                            }
                                            linearLayout.addView(relativeLayout2);
                                        }
                                    }
                                    w0().q.addView(linearLayout2);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        a.h("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5492a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Intent intent = getIntent();
        g7.c cVar = null;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("appInfo")) {
                l1 l1Var = x0().f9222c;
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable3 = (Parcelable) extras.getParcelable("appInfo", g.class);
                } else {
                    parcelable3 = extras.getParcelable("appInfo");
                }
                l1Var.i(parcelable3);
            }
            if (extras != null && extras.containsKey("app_selected")) {
                l1 l1Var2 = x0().f9223d;
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable2 = (Parcelable) extras.getParcelable("app_selected", e.class);
                } else {
                    parcelable2 = extras.getParcelable("app_selected");
                }
                l1Var2.i(parcelable2);
            }
            if (extras != null && extras.containsKey("old_version_name")) {
                x0().f9225f.i(extras.getString("old_version_name"));
            }
            if (extras != null && extras.containsKey("oldVersionId")) {
                l1 l1Var3 = x0().h;
                Boolean bool = Boolean.TRUE;
                l1Var3.getClass();
                l1Var3.j(null, bool);
                l1 l1Var4 = x0().g;
                Long valueOf = Long.valueOf(extras.getLong("oldVersionId"));
                l1Var4.getClass();
                l1Var4.j(null, valueOf);
            }
            if (extras != null && extras.containsKey("appReportVT")) {
                l1 l1Var5 = x0().f9224e;
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable = (Parcelable) extras.getParcelable("appReportVT", f2.class);
                } else {
                    parcelable = extras.getParcelable("appReportVT");
                }
                l1Var5.i(parcelable);
            }
            if (extras != null && extras.containsKey("isVirusTotalReportAvaialable")) {
                l1 l1Var6 = x0().i;
                Boolean valueOf2 = Boolean.valueOf(extras.getBoolean("isVirusTotalReportAvaialable"));
                l1Var6.getClass();
                l1Var6.j(null, valueOf2);
            }
        }
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            w0().r.setNavigationIcon(drawable);
            w0().r.setNavigationContentDescription(getString(R.string.back));
        }
        w0().r.setNavigationOnClickListener(new rc(this, 2));
        w0().f5497y.setTypeface(c.u);
        if (x0().f9222c.getValue() != null) {
            Object value = x0().f9222c.getValue();
            value.getClass();
            String i = ((g) value).i();
            if (i != null && i.length() != 0) {
                a0 d10 = a0.d();
                Object value2 = x0().f9222c.getValue();
                value2.getClass();
                e0 e10 = d10.e(((g) value2).i());
                float f7 = UptodownApp.G;
                e10.h(n4.e.v(this));
                e10.e((ImageView) w0().f5493b.l, null);
            } else {
                ((ImageView) w0().f5493b.l).setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_app_icon_placeholder));
            }
        } else if (x0().f9223d.getValue() != null) {
            ConcurrentHashMap concurrentHashMap = q.f11211a;
            Object value3 = x0().f9223d.getValue();
            value3.getClass();
            ((ImageView) w0().f5493b.l).setImageDrawable(q.b(this, ((e) value3).l));
        }
        ((TextView) w0().f5493b.f185n).setTypeface(c.u);
        if (x0().f9222c.getValue() != null) {
            TextView textView = (TextView) w0().f5493b.f185n;
            Object value4 = x0().f9222c.getValue();
            value4.getClass();
            textView.setText(((g) value4).f7358b);
        } else if (x0().f9223d.getValue() != null) {
            TextView textView2 = (TextView) w0().f5493b.f185n;
            Object value5 = x0().f9223d.getValue();
            value5.getClass();
            textView2.setText(((e) value5).f7339b);
        }
        ((TextView) w0().f5493b.o).setTypeface(c.v);
        CharSequence charSequence = (CharSequence) x0().f9225f.getValue();
        if (charSequence != null && charSequence.length() != 0) {
            ((TextView) w0().f5493b.o).setText((CharSequence) x0().f9225f.getValue());
        } else if (x0().f9222c.getValue() != null) {
            TextView textView3 = (TextView) w0().f5493b.o;
            Object value6 = x0().f9222c.getValue();
            value6.getClass();
            textView3.setText(((g) value6).l);
        } else if (x0().f9223d.getValue() != null) {
            TextView textView4 = (TextView) w0().f5493b.o;
            Object value7 = x0().f9223d.getValue();
            value7.getClass();
            textView4.setText(((e) value7).f7340n);
        }
        if (x0().f9222c.getValue() != null) {
            Object value8 = x0().f9222c.getValue();
            value8.getClass();
            String str = ((g) value8).f7379w;
            if (str != null && str.length() != 0) {
                ((TextView) w0().f5493b.m).setTypeface(c.v);
                ((TextView) w0().f5493b.m).setVisibility(0);
                TextView textView5 = (TextView) w0().f5493b.m;
                Object value9 = x0().f9222c.getValue();
                value9.getClass();
                textView5.setText(((g) value9).f7379w);
            }
        }
        w0().t.setTypeface(c.v);
        w0().s.setTypeface(c.u);
        w0().s.setOnClickListener(new rc(this, 3));
        w0().A.setTypeface(c.u);
        w0().f5498z.setTypeface(c.v);
        w0().o.setOnClickListener(new rc(this, 4));
        w0().C.setTypeface(c.u);
        w0().B.setTypeface(c.v);
        w0().p.setOnClickListener(new rc(this, 5));
        w0().v.setTypeface(c.v);
        w0().u.setTypeface(c.u);
        w0().f5496x.setTypeface(c.v);
        w0().f5495w.setTypeface(c.u);
        w0().f5494n.setOnClickListener(new o(24));
        if (x0().f9224e.getValue() != null) {
            y0();
            Object value10 = x0().f9224e.getValue();
            value10.getClass();
            ArrayList arrayList = ((f2) value10).o;
            if (arrayList != null && !arrayList.isEmpty()) {
                Object value11 = x0().f9224e.getValue();
                value11.getClass();
                C0((f2) value11);
            } else {
                Object value12 = x0().f9224e.getValue();
                value12.getClass();
                B0((f2) value12);
            }
        } else if (!((Boolean) x0().i.getValue()).booleanValue()) {
            A0();
            z0();
        } else {
            wc x02 = x0();
            Object value13 = x0().f9222c.getValue();
            value13.getClass();
            long j = ((g) value13).J;
            long longValue = ((Number) x0().g.getValue()).longValue();
            boolean booleanValue = ((Boolean) x0().h.getValue()).booleanValue();
            x02.getClass();
            c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
            j8.e eVar = p0.f3588a;
            f0.z(viewModelScope, d.f7053a, null, new vc(x02, booleanValue, j, longValue, this, null), 2);
            f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new g6(this, cVar, 6), 2);
        }
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new g6(this, cVar, 6), 2);
    }

    public final i1 w0() {
        return (i1) this.O.getValue();
    }

    public final wc x0() {
        return (wc) this.P.getValue();
    }

    public final void y0() {
        String str;
        String str2;
        String str3;
        String str4;
        f2 f2Var = (f2) x0().f9224e.getValue();
        String str5 = null;
        if (f2Var != null) {
            str = f2Var.f7353a;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            TextView textView = w0().v;
            Object value = x0().f9224e.getValue();
            value.getClass();
            textView.setText(((f2) value).f7353a);
        } else {
            g gVar = (g) x0().f9222c.getValue();
            if (gVar != null) {
                str2 = gVar.P;
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                TextView textView2 = w0().v;
                Object value2 = x0().f9222c.getValue();
                value2.getClass();
                textView2.setText(((g) value2).P);
            } else {
                w0().l.setVisibility(8);
            }
        }
        g gVar2 = (g) x0().f9222c.getValue();
        if (gVar2 != null) {
            str3 = gVar2.M;
        } else {
            str3 = null;
        }
        if (str3 != null && str3.length() != 0) {
            TextView textView3 = w0().f5496x;
            g gVar3 = (g) x0().f9222c.getValue();
            if (gVar3 != null) {
                str5 = gVar3.M;
            }
            textView3.setText(str5);
        } else {
            e eVar = (e) x0().f9223d.getValue();
            if (eVar != null) {
                str4 = eVar.u;
            } else {
                str4 = null;
            }
            if (str4 != null && str4.length() != 0) {
                TextView textView4 = w0().f5496x;
                e eVar2 = (e) x0().f9223d.getValue();
                if (eVar2 != null) {
                    str5 = eVar2.u;
                }
                textView4.setText(str5);
            } else {
                w0().m.setVisibility(8);
            }
        }
        if (w0().l.getVisibility() == 0) {
            final int i = 0;
            w0().l.setOnClickListener(new rc(this, i));
            w0().l.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: o4.sc

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VirusTotalReport f9103b;

                {
                    this.f9103b = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i3 = i;
                    VirusTotalReport virusTotalReport = this.f9103b;
                    switch (i3) {
                        case 0:
                            int i8 = VirusTotalReport.Q;
                            String obj = virusTotalReport.w0().v.getText().toString();
                            if (obj != null && obj.length() != 0) {
                                Object systemService = virusTotalReport.getSystemService("clipboard");
                                systemService.getClass();
                                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, obj));
                            }
                            return true;
                        default:
                            int i10 = VirusTotalReport.Q;
                            String obj2 = virusTotalReport.w0().f5496x.getText().toString();
                            if (obj2 != null && obj2.length() != 0) {
                                Object systemService2 = virusTotalReport.getSystemService("clipboard");
                                systemService2.getClass();
                                ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText(null, obj2));
                            }
                            return true;
                    }
                }
            });
        }
        if (w0().m.getVisibility() == 0) {
            final int i3 = 1;
            w0().m.setOnClickListener(new rc(this, i3));
            w0().m.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: o4.sc

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VirusTotalReport f9103b;

                {
                    this.f9103b = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i32 = i3;
                    VirusTotalReport virusTotalReport = this.f9103b;
                    switch (i32) {
                        case 0:
                            int i8 = VirusTotalReport.Q;
                            String obj = virusTotalReport.w0().v.getText().toString();
                            if (obj != null && obj.length() != 0) {
                                Object systemService = virusTotalReport.getSystemService("clipboard");
                                systemService.getClass();
                                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, obj));
                            }
                            return true;
                        default:
                            int i10 = VirusTotalReport.Q;
                            String obj2 = virusTotalReport.w0().f5496x.getText().toString();
                            if (obj2 != null && obj2.length() != 0) {
                                Object systemService2 = virusTotalReport.getSystemService("clipboard");
                                systemService2.getClass();
                                ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText(null, obj2));
                            }
                            return true;
                    }
                }
            });
        }
        w0().f5494n.setVisibility(8);
    }

    public final void z0() {
        w0().f5495w.setVisibility(8);
        w0().f5496x.setVisibility(8);
        w0().t.setText(getString(R.string.vt_report_not_available_check_on));
        w0().v.setText(getString(R.string.vt_report_not_available_pending));
        w0().f5494n.setVisibility(8);
    }
}
