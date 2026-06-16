package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17462a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17463b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17464c;

    public /* synthetic */ j1(int i10, boolean z6) {
        this.f17463b = i10;
        this.f17464c = z6;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z KeepScreenOn$lambda$1;
        int i10 = this.f17462a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                KeepScreenOn$lambda$1 = KeepScreenOnKt.KeepScreenOn$lambda$1(this.f17464c, this.f17463b, mVar, intValue);
                return KeepScreenOn$lambda$1;
            default:
                return io.elevenlabs.ui.echo.components.MenuKt.d(this.f17463b, this.f17464c, mVar, intValue);
        }
    }

    public /* synthetic */ j1(boolean z6, int i10) {
        this.f17464c = z6;
        this.f17463b = i10;
    }
}
