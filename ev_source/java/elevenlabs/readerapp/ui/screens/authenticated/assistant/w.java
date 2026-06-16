package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import java.util.List;
import p3.b1;
import q2.b7;
import q2.c7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements ho.p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15175c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15178f;

    public /* synthetic */ w(Object obj, boolean z6, boolean z10, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f15173a = i11;
        this.f15177e = obj;
        this.f15174b = z6;
        this.f15175c = z10;
        this.f15178f = obj2;
        this.Y = obj3;
        this.Z = obj4;
        this.f15176d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z AssistantTextModeUI$lambda$4;
        switch (this.f15173a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                AssistantTextModeUI$lambda$4 = AssistantTextModeScreenKt.AssistantTextModeUI$lambda$4((List) this.f15177e, this.f15174b, this.f15175c, (ho.l) this.f15178f, (ho.a) this.Y, (ho.a) this.Z, this.f15176d, (u2.m) obj, intValue);
                return AssistantTextModeUI$lambda$4;
            default:
                ((Integer) obj2).getClass();
                c7.b((i3.t) this.f15177e, this.f15174b, this.f15175c, (b7) this.f15178f, (p1.k) this.Y, (b1) this.Z, (u2.m) obj, u2.r.M(this.f15176d | 1));
                return sn.z.f31622a;
        }
    }
}
