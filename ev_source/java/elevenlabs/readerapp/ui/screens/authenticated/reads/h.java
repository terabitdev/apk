package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.model.AsyncCallResult;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16918c;

    public /* synthetic */ h(Object obj, Object obj2, int i10) {
        this.f16916a = i10;
        this.f16917b = obj;
        this.f16918c = obj2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AddSharedReadState invokeSuspend$lambda$0;
        ReadLinkShareState invokeSuspend$lambda$1;
        ImportFileState onFilePicked$lambda$0;
        ImportLinkState onParsingCompleted$lambda$0;
        sn.z SheetItem$lambda$0$0;
        sn.z PasteLinkScreenUI$lambda$2$0$0$3$0;
        sn.z ReadLinkShareSheet$lambda$1$0;
        ReadShareDetailsState readId$lambda$0;
        ReadShareOptionsState readId$lambda$02;
        switch (this.f16916a) {
            case 0:
                invokeSuspend$lambda$0 = AddSharedReadViewModel$load$1$1.invokeSuspend$lambda$0((AddSharedReadViewModel) this.f16917b, (AsyncCallResult.Error) this.f16918c, (AddSharedReadState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                return ImportFileViewModel$listen$1$1.i((ImportFileViewModel) this.f16917b, (AsyncCallResult.Success) this.f16918c, (ImportFileState) obj);
            case 2:
                return ImportLinkViewModel$onParsingCompleted$1$1.h((ImportLinkViewModel) this.f16917b, (AsyncCallResult.Success) this.f16918c, (ImportLinkState) obj);
            case 3:
                invokeSuspend$lambda$1 = ReadLinkShareViewModel$setRead$1$1.invokeSuspend$lambda$1((ReadLinkShareViewModel) this.f16917b, (AsyncCallResult.Error) this.f16918c, (ReadLinkShareState) obj);
                return invokeSuspend$lambda$1;
            case 4:
                return WriteViewModel$listen$1$1.m((WriteViewModel) this.f16917b, (AsyncCallResult.Success) this.f16918c, (WriteState) obj);
            case 5:
                onFilePicked$lambda$0 = ImportFileViewModel.onFilePicked$lambda$0((ImportFileViewModel) this.f16917b, (String) this.f16918c, (ImportFileState) obj);
                return onFilePicked$lambda$0;
            case 6:
                onParsingCompleted$lambda$0 = ImportLinkViewModel.onParsingCompleted$lambda$0((ImportLinkViewModel) this.f16917b, (String) this.f16918c, (ImportLinkState) obj);
                return onParsingCompleted$lambda$0;
            case 7:
                SheetItem$lambda$0$0 = MoreActionsSheetKt.SheetItem$lambda$0$0((String) this.f16917b, (ho.a) this.f16918c, (p4.b0) obj);
                return SheetItem$lambda$0$0;
            case 8:
                PasteLinkScreenUI$lambda$2$0$0$3$0 = PasteLinkScreenKt.PasteLinkScreenUI$lambda$2$0$0$3$0((ho.l) this.f16917b, (z0) this.f16918c, (String) obj);
                return PasteLinkScreenUI$lambda$2$0$0$3$0;
            case 9:
                ReadLinkShareSheet$lambda$1$0 = ReadLinkShareSheetKt.ReadLinkShareSheet$lambda$1$0((ReadLinkShareViewModel) this.f16917b, (ho.a) this.f16918c, (m.a) obj);
                return ReadLinkShareSheet$lambda$1$0;
            case 10:
                readId$lambda$0 = ReadShareDetailsViewModel.setReadId$lambda$0((String) this.f16917b, (ReadShareDetailsViewModel) this.f16918c, (ReadShareDetailsState) obj);
                return readId$lambda$0;
            default:
                readId$lambda$02 = ReadShareOptionsViewModel.setReadId$lambda$0((String) this.f16917b, (ReadShareOptionsViewModel) this.f16918c, (ReadShareOptionsState) obj);
                return readId$lambda$02;
        }
    }
}
