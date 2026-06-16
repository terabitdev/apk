package io.elevenlabs.ui;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import ho.p;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.e;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0005\u001a\u00020\u0002*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b²\u0006\u000e\u0010\u0007\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroid/content/Context;", "Lu2/s2;", "", "collectIsTalkbackEnabledAsState", "(Landroid/content/Context;Lu2/m;I)Lu2/s2;", "isScreenReaderOn", "(Landroid/content/Context;)Z", "accessibilityEnabled", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AccessibilityExtensionsKt {
    public static final s2 collectIsTalkbackEnabledAsState(Context context, m mVar, int i10) {
        context.getClass();
        q qVar = (q) mVar;
        qVar.X(-1164960510);
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService(AccessibilityManager.class);
        e eVar = l.f33918a;
        if (accessibilityManager == null) {
            qVar.X(-2002680425);
            Object L = qVar.L();
            if (L == eVar) {
                L = r.A(Boolean.FALSE);
                qVar.h0(L);
            }
            z0 z0Var = (z0) L;
            qVar.p(false);
            qVar.p(false);
            return z0Var;
        }
        qVar.X(1459416695);
        qVar.p(false);
        Object L2 = qVar.L();
        if (L2 == eVar) {
            L2 = r.A(Boolean.valueOf(isScreenReaderOn(context)));
            qVar.h0(L2);
        }
        z0 z0Var2 = (z0) L2;
        boolean isEnabled = accessibilityManager.isEnabled();
        Object L3 = qVar.L();
        if (L3 == eVar) {
            L3 = r.A(Boolean.valueOf(isEnabled));
            qVar.h0(L3);
        }
        final z0 z0Var3 = (z0) L3;
        Object L4 = qVar.L();
        if (L4 == eVar) {
            L4 = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: io.elevenlabs.ui.a
                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final void onAccessibilityStateChanged(boolean z6) {
                    AccessibilityExtensionsKt.collectIsTalkbackEnabledAsState$lambda$4(z0.this, z6);
                }
            };
            qVar.h0(L4);
        }
        accessibilityManager.addAccessibilityStateChangeListener((AccessibilityManager.AccessibilityStateChangeListener) L4);
        Boolean valueOf = Boolean.valueOf(collectIsTalkbackEnabledAsState$lambda$3(z0Var3));
        boolean h10 = qVar.h(context);
        Object L5 = qVar.L();
        if (h10 || L5 == eVar) {
            L5 = new AccessibilityExtensionsKt$collectIsTalkbackEnabledAsState$2$1(z0Var2, context, z0Var3, null);
            qVar.h0(L5);
        }
        r.f((p) L5, valueOf, qVar);
        qVar.p(false);
        return z0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean collectIsTalkbackEnabledAsState$lambda$3(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectIsTalkbackEnabledAsState$lambda$4(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScreenReaderOn(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService(AccessibilityManager.class);
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
            enabledAccessibilityServiceList.getClass();
            if (!enabledAccessibilityServiceList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
