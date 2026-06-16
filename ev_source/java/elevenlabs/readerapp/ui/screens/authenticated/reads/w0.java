package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WriteViewModel f17004b;

    public /* synthetic */ w0(WriteViewModel writeViewModel, int i10) {
        this.f17003a = i10;
        this.f17004b = writeViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z WriteScreen$lambda$8$0;
        WriteState listen$lambda$0;
        switch (this.f17003a) {
            case 0:
                WriteScreen$lambda$8$0 = WriteScreenKt.WriteScreen$lambda$8$0(this.f17004b, (ho.l) obj);
                return WriteScreen$lambda$8$0;
            default:
                listen$lambda$0 = WriteViewModel.listen$lambda$0(this.f17004b, (WriteState) obj);
                return listen$lambda$0;
        }
    }
}
