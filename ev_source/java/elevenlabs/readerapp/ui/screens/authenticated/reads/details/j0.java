package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import android.app.Activity;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.RawOneTimeProduct;
import io.elevenlabs.domain.model.ReadDetailsResponse;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$loadReadDetails$1;
import java.util.Map;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16826b;

    public /* synthetic */ j0(Object obj, int i10) {
        this.f16825a = i10;
        this.f16826b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ReadDetailsState emit$lambda$0;
        ReadDetailsState emit$lambda$02;
        ReadDetailsState invokeSuspend$lambda$0;
        ReadDetailsState invokeSuspend$lambda$02;
        sn.z ReadDetailsScreenUi$lambda$19$0$3$0$0;
        sn.z ReadDetailsScreenUi$lambda$19$0$8$0$0;
        sn.z ReadDetailsScreen$lambda$9$0$0;
        switch (this.f16825a) {
            case 0:
                emit$lambda$0 = ReadDetailsViewModel.AnonymousClass4.AnonymousClass1.emit$lambda$0((Map) this.f16826b, (ReadDetailsState) obj);
                return emit$lambda$0;
            case 1:
                emit$lambda$02 = ReadDetailsViewModel$loadReadDetails$1.AnonymousClass1.emit$lambda$0((ReadDetailsResponse) this.f16826b, (ReadDetailsState) obj);
                return emit$lambda$02;
            case 2:
                invokeSuspend$lambda$0 = ReadDetailsViewModel$loadReadDetails$2.invokeSuspend$lambda$0((ReadMeta) this.f16826b, (ReadDetailsState) obj);
                return invokeSuspend$lambda$0;
            case 3:
                invokeSuspend$lambda$02 = ReadDetailsViewModel$loadStoreProduct$1$1.invokeSuspend$lambda$0((RawOneTimeProduct) this.f16826b, (ReadDetailsState) obj);
                return invokeSuspend$lambda$02;
            case 4:
                ReadDetailsScreenUi$lambda$19$0$3$0$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$19$0$3$0$0((ExploreRead) this.f16826b, (ReadDetailsViewModel) obj);
                return ReadDetailsScreenUi$lambda$19$0$3$0$0;
            case 5:
                ReadDetailsScreenUi$lambda$19$0$8$0$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$19$0$8$0$0((Activity) this.f16826b, (ReadDetailsViewModel) obj);
                return ReadDetailsScreenUi$lambda$19$0$8$0$0;
            default:
                ReadDetailsScreen$lambda$9$0$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$9$0$0((ho.p) this.f16826b, (String) obj);
                return ReadDetailsScreen$lambda$9$0$0;
        }
    }
}
