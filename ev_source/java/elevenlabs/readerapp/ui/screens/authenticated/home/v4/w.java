package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeStateV4 f15776b;

    public /* synthetic */ w(int i10, HomeStateV4 homeStateV4) {
        this.f15775a = i10;
        this.f15776b = homeStateV4;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f15775a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return PreviewHomeScreenV4DefaultGroupDark1Kt.a(this.f15776b, mVar, intValue);
            default:
                return PreviewHomeScreenV4DefaultGroupLightKt.a(this.f15776b, mVar, intValue);
        }
    }
}
