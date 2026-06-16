package io.elevenlabs.readerapp.core.router;

import i1.j2;
import i4.q2;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesState;
import java.util.List;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements ho.q {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14450b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14451c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14454f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f14455x0;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f14449a = i10;
        this.f14450b = obj;
        this.f14451c = obj2;
        this.f14452d = obj3;
        this.f14453e = obj4;
        this.f14454f = obj5;
        this.Y = obj6;
        this.Z = obj7;
        this.f14455x0 = obj8;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z Router$lambda$20$0;
        sn.z PlayerPreferencesScreenUI$lambda$0$0$0$1;
        switch (this.f14449a) {
            case 0:
                Router$lambda$20$0 = RouterKt.Router$lambda$20$0((na.c0) this.f14450b, (RouterViewModel) this.f14451c, (fr.d0) this.f14452d, (String) this.f14453e, (h5.c) this.f14454f, (q2) this.Y, (s2) this.Z, (List) this.f14455x0, (j2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return Router$lambda$20$0;
            default:
                PlayerPreferencesScreenUI$lambda$0$0$0$1 = PlayerPreferencesScreenKt.PlayerPreferencesScreenUI$lambda$0$0$0$1((ho.a) this.f14450b, (PlayerPreferencesState) this.f14451c, (ho.l) this.f14452d, (ho.l) this.f14453e, (ho.l) this.f14454f, (ho.l) this.Y, (ho.l) this.Z, (ho.l) this.f14455x0, (r1.s) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return PlayerPreferencesScreenUI$lambda$0$0$0$1;
        }
    }
}
