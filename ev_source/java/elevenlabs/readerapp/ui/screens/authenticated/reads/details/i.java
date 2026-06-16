package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import io.elevenlabs.domain.model.ReadDetailsSection;
import java.util.List;
import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16821c;

    public /* synthetic */ i(Object obj, Object obj2, int i10) {
        this.f16819a = i10;
        this.f16820b = obj;
        this.f16821c = obj2;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z ReadDetailsScreenUi$lambda$19$2;
        sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$1;
        sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$4;
        sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$5;
        sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$9;
        switch (this.f16819a) {
            case 0:
                ReadDetailsScreenUi$lambda$19$2 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$19$2((ho.a) this.f16820b, (i3.t) this.f16821c, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return ReadDetailsScreenUi$lambda$19$2;
            case 1:
                ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$1 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$1((ReadDetailsSection.Meta) this.f16820b, (List) this.f16821c, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$1;
            case 2:
                ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$4 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$4((ho.a) this.f16820b, (ho.a) this.f16821c, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$4;
            case 3:
                ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$5 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$5((ReadDetailsSection.Author) this.f16820b, (ho.l) this.f16821c, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$5;
            default:
                ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$9 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$9((ReadDetailsSection.Read) this.f16820b, (ho.l) this.f16821c, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$9;
        }
    }
}
