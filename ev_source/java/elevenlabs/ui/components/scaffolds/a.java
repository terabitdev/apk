package io.elevenlabs.ui.components.scaffolds;

import ho.p;
import ho.r;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p {
    public final /* synthetic */ r Y;
    public final /* synthetic */ int Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17627a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f17630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f17631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ho.a f17632f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f17633x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f17634y0;

    public /* synthetic */ a(boolean z6, boolean z10, long j4, float f10, ho.a aVar, r rVar, r rVar2, int i10, int i11) {
        this.f17628b = z6;
        this.f17629c = z10;
        this.f17630d = j4;
        this.f17631e = f10;
        this.f17632f = aVar;
        this.Y = rVar;
        this.f17634y0 = rVar2;
        this.Z = i10;
        this.f17633x0 = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z BottomSheetScaffold_jb_40ds$lambda$3;
        z BottomSheetScaffold_jb_40ds$lambda$1;
        switch (this.f17627a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BottomSheetScaffold_jb_40ds$lambda$3 = BottomSheetScaffoldKt.BottomSheetScaffold_jb_40ds$lambda$3(this.f17628b, this.f17629c, this.f17630d, this.f17631e, this.f17632f, this.Y, (r) this.f17634y0, this.Z, this.f17633x0, (m) obj, intValue);
                return BottomSheetScaffold_jb_40ds$lambda$3;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                BottomSheetScaffold_jb_40ds$lambda$1 = BottomSheetScaffoldKt.BottomSheetScaffold_jb_40ds$lambda$1(this.f17628b, this.f17629c, this.f17630d, this.f17631e, this.f17632f, (String) this.f17634y0, this.Y, this.Z, this.f17633x0, (m) obj, intValue2);
                return BottomSheetScaffold_jb_40ds$lambda$1;
        }
    }

    public /* synthetic */ a(boolean z6, boolean z10, long j4, float f10, ho.a aVar, String str, r rVar, int i10, int i11) {
        this.f17628b = z6;
        this.f17629c = z10;
        this.f17630d = j4;
        this.f17631e = f10;
        this.f17632f = aVar;
        this.f17634y0 = str;
        this.Y = rVar;
        this.Z = i10;
        this.f17633x0 = i11;
    }
}
