package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import fr.d0;
import ho.p;
import i3.t;
import io.elevenlabs.ui.components.ActionSpec;
import io.elevenlabs.ui.components.SwipeToActionBoxKt;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14945a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f14947c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14950f;

    public /* synthetic */ b(String str, String str2, t tVar, float f10, String str3, int i10, int i11) {
        this.f14950f = str;
        this.Y = str2;
        this.f14947c = tVar;
        this.f14946b = f10;
        this.Z = str3;
        this.f14948d = i10;
        this.f14949e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z AccountAvatar_hGBTI10$lambda$2;
        z ActionRowsContainer$lambda$2;
        switch (this.f14945a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                AccountAvatar_hGBTI10$lambda$2 = AccountAvatarKt.AccountAvatar_hGBTI10$lambda$2((String) this.f14950f, (String) this.Y, this.f14947c, this.f14946b, (String) this.Z, this.f14948d, this.f14949e, (m) obj, intValue);
                return AccountAvatar_hGBTI10$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ActionRowsContainer$lambda$2 = SwipeToActionBoxKt.ActionRowsContainer$lambda$2((n1.p) this.f14950f, (ActionSpec) this.Y, this.f14946b, (d0) this.Z, this.f14947c, this.f14948d, this.f14949e, (m) obj, intValue2);
                return ActionRowsContainer$lambda$2;
        }
    }

    public /* synthetic */ b(n1.p pVar, ActionSpec actionSpec, float f10, d0 d0Var, t tVar, int i10, int i11) {
        this.f14950f = pVar;
        this.Y = actionSpec;
        this.f14946b = f10;
        this.Z = d0Var;
        this.f14947c = tVar;
        this.f14948d = i10;
        this.f14949e = i11;
    }
}
