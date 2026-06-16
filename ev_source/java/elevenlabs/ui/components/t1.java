package io.elevenlabs.ui.components;

import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements ho.p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17660a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17661b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3.t f17662c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17665f;

    public /* synthetic */ t1(int i10, int i11, int i12, ho.l lVar, i3.t tVar, String str, List list) {
        this.Y = list;
        this.f17661b = i10;
        this.Z = lVar;
        this.f17662c = tVar;
        this.f17665f = str;
        this.f17663d = i11;
        this.f17664e = i12;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z PillButton$lambda$1;
        sn.z DraggableItem$lambda$3;
        sn.z SegmentedSelectorControl$lambda$7;
        switch (this.f17660a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PillButton$lambda$1 = PillButtonKt.PillButton$lambda$1((String) this.f17665f, this.f17661b, (ho.a) this.Y, (PillButtonVariant) this.Z, this.f17662c, this.f17663d, this.f17664e, (u2.m) obj, intValue);
                return PillButton$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                DraggableItem$lambda$3 = ReorderableRowKt.DraggableItem$lambda$3((t1.b) this.f17665f, (DragDropState) this.Y, this.f17661b, this.f17662c, (ho.r) this.Z, this.f17663d, this.f17664e, (u2.m) obj, intValue2);
                return DraggableItem$lambda$3;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                SegmentedSelectorControl$lambda$7 = SegmentedSelectorControlKt.SegmentedSelectorControl$lambda$7((List) this.Y, this.f17661b, (ho.l) this.Z, this.f17662c, (String) this.f17665f, this.f17663d, this.f17664e, (u2.m) obj, intValue3);
                return SegmentedSelectorControl$lambda$7;
        }
    }

    public /* synthetic */ t1(String str, int i10, ho.a aVar, PillButtonVariant pillButtonVariant, i3.t tVar, int i11, int i12) {
        this.f17665f = str;
        this.f17661b = i10;
        this.Y = aVar;
        this.Z = pillButtonVariant;
        this.f17662c = tVar;
        this.f17663d = i11;
        this.f17664e = i12;
    }

    public /* synthetic */ t1(t1.b bVar, DragDropState dragDropState, int i10, i3.t tVar, ho.r rVar, int i11, int i12) {
        this.f17665f = bVar;
        this.Y = dragDropState;
        this.f17661b = i10;
        this.f17662c = tVar;
        this.Z = rVar;
        this.f17663d = i11;
        this.f17664e = i12;
    }
}
