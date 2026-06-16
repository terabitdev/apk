package io.elevenlabs.ui.components;

import io.elevenlabs.ui.components.headers.HeaderKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements ho.p {
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3.t f17402c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17405f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f17406x0;

    public /* synthetic */ g2(String str, i3.t tVar, ho.q qVar, r1.b3 b3Var, i3.f fVar, int i10, int i11, int i12) {
        this.f17400a = 3;
        this.f17401b = str;
        this.f17402c = tVar;
        this.f17405f = qVar;
        this.f17403d = b3Var;
        this.f17406x0 = fVar;
        this.f17404e = i10;
        this.Y = i11;
        this.Z = i12;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Select$lambda$7;
        sn.z Select$lambda$4;
        sn.z VerificationCodeInput$lambda$3;
        sn.z Header$lambda$1;
        switch (this.f17400a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Select$lambda$7 = SelectKt.Select$lambda$7(this.f17401b, this.f17402c, (ho.a) this.f17403d, (ho.p) this.f17406x0, this.f17404e, (String) this.f17405f, this.Y, this.Z, (u2.m) obj, intValue);
                return Select$lambda$7;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                Select$lambda$4 = SelectKt.Select$lambda$4(this.f17401b, this.f17402c, (ho.a) this.f17403d, (Integer) this.f17406x0, this.f17404e, (String) this.f17405f, this.Y, this.Z, (u2.m) obj, intValue2);
                return Select$lambda$4;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                VerificationCodeInput$lambda$3 = VerificationCodeInputKt.VerificationCodeInput$lambda$3(this.f17401b, (String) this.f17405f, (ho.l) this.f17403d, this.f17404e, this.f17402c, (a2.z1) this.f17406x0, this.Y, this.Z, (u2.m) obj, intValue3);
                return VerificationCodeInput$lambda$3;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                Header$lambda$1 = HeaderKt.Header$lambda$1(this.f17401b, this.f17402c, (ho.q) this.f17405f, (r1.b3) this.f17403d, (i3.f) this.f17406x0, this.f17404e, this.Y, this.Z, (u2.m) obj, intValue4);
                return Header$lambda$1;
        }
    }

    public /* synthetic */ g2(String str, i3.t tVar, ho.a aVar, Object obj, int i10, String str2, int i11, int i12, int i13) {
        this.f17400a = i13;
        this.f17401b = str;
        this.f17402c = tVar;
        this.f17403d = aVar;
        this.f17406x0 = obj;
        this.f17404e = i10;
        this.f17405f = str2;
        this.Y = i11;
        this.Z = i12;
    }

    public /* synthetic */ g2(String str, String str2, ho.l lVar, int i10, i3.t tVar, a2.z1 z1Var, int i11, int i12) {
        this.f17400a = 2;
        this.f17401b = str;
        this.f17405f = str2;
        this.f17403d = lVar;
        this.f17404e = i10;
        this.f17402c = tVar;
        this.f17406x0 = z1Var;
        this.Y = i11;
        this.Z = i12;
    }
}
