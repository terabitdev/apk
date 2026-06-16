package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.readerapp.ui.components.explore.ExploreCarouselDefaultsKt;
import io.elevenlabs.ui.components.SelectableCardV2Kt;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14683c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14685e;

    public /* synthetic */ i(Object obj, boolean z6, int i10, int i11, int i12) {
        this.f14681a = i12;
        this.f14685e = obj;
        this.f14682b = z6;
        this.f14683c = i10;
        this.f14684d = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z CollectionMetaSmallRow$lambda$0;
        sn.z RadioButton$lambda$1;
        sn.z ElevenLabsTheme$lambda$2;
        switch (this.f14681a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                CollectionMetaSmallRow$lambda$0 = CollectionMetaSmallRowKt.CollectionMetaSmallRow$lambda$0((CollectionMeta) this.f14685e, this.f14682b, this.f14683c, this.f14684d, (u2.m) obj, intValue);
                return CollectionMetaSmallRow$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                return ExploreCarouselDefaultsKt.a((List) this.f14685e, this.f14682b, this.f14683c, this.f14684d, (u2.m) obj, intValue2);
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                RadioButton$lambda$1 = SelectableCardV2Kt.RadioButton$lambda$1(this.f14682b, (i3.t) this.f14685e, this.f14683c, this.f14684d, (u2.m) obj, intValue3);
                return RadioButton$lambda$1;
            case 3:
                ((Integer) obj2).getClass();
                int M = u2.r.M(this.f14683c | 1);
                androidx.room.m0.a((ho.a) this.f14685e, this.f14682b, M, (u2.m) obj, this.f14684d);
                return sn.z.f31622a;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                ElevenLabsTheme$lambda$2 = ElevenLabsThemeKt.ElevenLabsTheme$lambda$2(this.f14682b, (ho.p) this.f14685e, this.f14683c, this.f14684d, (u2.m) obj, intValue4);
                return ElevenLabsTheme$lambda$2;
        }
    }

    public /* synthetic */ i(boolean z6, Object obj, int i10, int i11, int i12) {
        this.f14681a = i12;
        this.f14682b = z6;
        this.f14685e = obj;
        this.f14683c = i10;
        this.f14684d = i11;
    }
}
