package io.elevenlabs.readerapp.ui.screens.authenticated.series;

import ho.p;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables.DetailsSectionKt;
import io.elevenlabs.ui.components.primitives.VerticalGradientKt;
import java.util.List;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f17070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f17071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17073e;

    public /* synthetic */ e(t tVar, List list, int i10, int i11) {
        this.f17069a = 2;
        this.f17071c = tVar;
        this.f17070b = list;
        this.f17072d = i10;
        this.f17073e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z StackedBookCovers$lambda$3;
        z DetailsSection$lambda$1;
        switch (this.f17069a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                t tVar = this.f17071c;
                StackedBookCovers$lambda$3 = StackedBookCoversKt.StackedBookCovers$lambda$3(this.f17070b, tVar, this.f17072d, this.f17073e, (m) obj, intValue);
                return StackedBookCovers$lambda$3;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                t tVar2 = this.f17071c;
                DetailsSection$lambda$1 = DetailsSectionKt.DetailsSection$lambda$1(this.f17070b, tVar2, this.f17072d, this.f17073e, (m) obj, intValue2);
                return DetailsSection$lambda$1;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                return VerticalGradientKt.b(this.f17071c, this.f17070b, this.f17072d, this.f17073e, (m) obj, intValue3);
        }
    }

    public /* synthetic */ e(List list, t tVar, int i10, int i11, int i12) {
        this.f17069a = i12;
        this.f17070b = list;
        this.f17071c = tVar;
        this.f17072d = i10;
        this.f17073e = i11;
    }
}
