package com.inmobi.cmp.presentation.components;

import a5.h;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import c8.c1;
import c8.f0;
import c8.p0;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.data.model.ChoiceColor;
import com.inmobi.cmp.data.model.ThemeMode;
import da.c;
import f1.g;
import j8.d;
import j8.e;
import java.util.UUID;
import kotlin.jvm.internal.p;
import o4.a0;
import q1.e0;
import t9.b;
import t9.o;
import z9.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class CmpActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4371b = 0;

    /* renamed from: a, reason: collision with root package name */
    public c f4372a;

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    public final void h(t9.c cVar, boolean z10) {
        String str;
        b bVar;
        b bVar2;
        if (!z10) {
            c cVar2 = this.f4372a;
            if (cVar2 != null) {
                str = g.d(cVar, cVar2.f4775a);
            } else {
                p.i("viewModel");
                throw null;
            }
        } else {
            str = null;
        }
        UUID uuid = t9.p.f10785a;
        ?? obj = new Object();
        obj.f7675a = cVar;
        ?? obj2 = new Object();
        b bVar3 = b.TCF_CHANGE_OF_CONSENT;
        obj2.f7675a = bVar3;
        int ordinal = cVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (x.g.f11254a) {
                            a aVar = (a) aa.c.v.getValue();
                            aVar.getClass();
                            if (aVar.f11814a.getBoolean("GBCShown", false)) {
                                bVar2 = b.GBC_CHANGE_OF_CONSENT;
                            } else {
                                bVar2 = b.GBC;
                            }
                        } else {
                            bVar2 = b.NR;
                        }
                        obj2.f7675a = bVar2;
                    }
                } else {
                    if (z10) {
                        bVar = b.MSPA_MANDATORY;
                    } else {
                        a aVar2 = (a) aa.c.v.getValue();
                        aVar2.getClass();
                        if (aVar2.f11814a.getBoolean("MSPAShown", false)) {
                            bVar = b.MSPA_CHANGE_OF_CONSENT;
                        } else {
                            bVar = b.MSPA_OPT_OUT;
                        }
                    }
                    obj2.f7675a = bVar;
                }
            } else {
                if (z10) {
                    bVar3 = b.TCF_MANDATORY;
                }
                obj2.f7675a = bVar3;
            }
        } else {
            obj2.f7675a = b.USP;
        }
        t9.p.f10786b.h("startOnPage", obj.f7675a + "_1");
        t9.p.f10785a = UUID.randomUUID();
        if (cVar == t9.c.GDPR) {
            ChoiceCmp.INSTANCE.setCurrentSessionId(t9.p.f10785a);
        }
        e eVar = p0.f3588a;
        f0.z(c1.f3545a, d.f7053a, null, new o(obj, obj2, str, z10, null), 2);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        ChoiceColor choiceColor;
        int i3;
        ChoiceColor darkModeColors;
        super.onCreate(bundle);
        ThemeMode themeMode = aa.c.f407b.getThemeMode();
        if (themeMode == null) {
            i = -1;
        } else {
            i = da.b.f4774a[themeMode.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                getDelegate().setLocalNightMode(2);
            }
        } else {
            getDelegate().setLocalNightMode(1);
        }
        a aVar = (a) aa.c.v.getValue();
        a0 a0Var = aa.c.f412k;
        g7.c cVar = null;
        if (a0Var == null) {
            z8.p pVar = aa.c.e().l;
            if (pVar == null) {
                choiceColor = null;
            } else {
                String str = pVar.f11801a;
                choiceColor = pVar.f11803c;
                ChoiceColor choiceColor2 = pVar.f11802b;
                if (str.equals("LIGHT") || (!str.equals("DARK") && (choiceColor2 == null || choiceColor == null ? choiceColor2 != null : (i3 = getResources().getConfiguration().uiMode & 48) == 16 || i3 != 32))) {
                    choiceColor = choiceColor2;
                }
            }
            if (aa.c.f407b.getThemeMode() == ThemeMode.LIGHT) {
                darkModeColors = aa.c.f407b.getLightModeColors();
            } else if (aa.c.f407b.getThemeMode() == ThemeMode.DARK) {
                darkModeColors = aa.c.f407b.getDarkModeColors();
            } else if (aa.c.f407b.getLightModeColors() != null && aa.c.f407b.getDarkModeColors() != null) {
                int i8 = getResources().getConfiguration().uiMode & 48;
                if (i8 != 16) {
                    if (i8 == 32) {
                        darkModeColors = aa.c.f407b.getDarkModeColors();
                    }
                    darkModeColors = aa.c.f407b.getLightModeColors();
                } else {
                    darkModeColors = aa.c.f407b.getLightModeColors();
                }
            } else {
                if (aa.c.f407b.getLightModeColors() == null) {
                    darkModeColors = aa.c.f407b.getDarkModeColors();
                }
                darkModeColors = aa.c.f407b.getLightModeColors();
            }
            a0Var = new a0(choiceColor, darkModeColors, new e0(19));
            aa.c.f412k = a0Var;
        }
        this.f4372a = new c(aVar, a0Var, aa.c.e());
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(this, cVar, 7), 3);
    }
}
