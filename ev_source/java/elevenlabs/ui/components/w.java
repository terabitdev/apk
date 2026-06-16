package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17687b;

    public /* synthetic */ w(String str, int i10) {
        this.f17686a = i10;
        this.f17687b = str;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Callout$lambda$0;
        sn.z Checkbox$lambda$0;
        sn.z Select$lambda$6;
        sn.z SelectableBadgeBox$lambda$0$3;
        int i10 = this.f17686a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                Callout$lambda$0 = CalloutKt.Callout$lambda$0(this.f17687b, mVar, intValue);
                return Callout$lambda$0;
            case 1:
                Checkbox$lambda$0 = CheckboxKt.Checkbox$lambda$0(this.f17687b, mVar, intValue);
                return Checkbox$lambda$0;
            case 2:
                return ReadItemCoverKt.b(this.f17687b, mVar, intValue);
            case 3:
                Select$lambda$6 = SelectKt.Select$lambda$6(this.f17687b, mVar, intValue);
                return Select$lambda$6;
            default:
                SelectableBadgeBox$lambda$0$3 = SelectableBadgeBoxKt.SelectableBadgeBox$lambda$0$3(this.f17687b, mVar, intValue);
                return SelectableBadgeBox$lambda$0$3;
        }
    }
}
