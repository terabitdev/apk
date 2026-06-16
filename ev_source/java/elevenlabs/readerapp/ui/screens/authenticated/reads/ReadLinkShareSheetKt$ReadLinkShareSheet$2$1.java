package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import com.google.protobuf.c6;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadLinkShareSheetKt$ReadLinkShareSheet$2$1", f = "ReadLinkShareSheet.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadLinkShareSheetKt$ReadLinkShareSheet$2$1 extends yn.i implements ho.p {
    final /* synthetic */ String $chooseAppText;
    final /* synthetic */ j.j $shareLauncher;
    final /* synthetic */ ReadLinkShareState $state;
    final /* synthetic */ ReadLinkShareViewModel $vm;
    int label;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadLinkShareOption.values().length];
            try {
                iArr[ReadLinkShareOption.Whatsapp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadLinkShareOption.Twitter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadLinkShareOption.More.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadLinkShareSheetKt$ReadLinkShareSheet$2$1(ReadLinkShareState readLinkShareState, j.j jVar, ReadLinkShareViewModel readLinkShareViewModel, String str, wn.c<? super ReadLinkShareSheetKt$ReadLinkShareSheet$2$1> cVar) {
        super(2, cVar);
        this.$state = readLinkShareState;
        this.$shareLauncher = jVar;
        this.$vm = readLinkShareViewModel;
        this.$chooseAppText = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReadLinkShareSheetKt$ReadLinkShareSheet$2$1(this.$state, this.$shareLauncher, this.$vm, this.$chooseAppText, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReadLinkShareSheetKt$ReadLinkShareSheet$2$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        if (this.label == 0) {
            sn.a.g(obj);
            if (this.$state.getData() != null) {
                ReadLinkShareOption shareOption = this.$state.getShareOption();
                if (shareOption == null) {
                    i10 = -1;
                } else {
                    i10 = WhenMappings.$EnumSwitchMapping$0[shareOption.ordinal()];
                }
                if (i10 != -1) {
                    if (i10 == 1) {
                        ReadLinkShareSheetKt.handleWhatsAppShare(this.$state, this.$shareLauncher, this.$vm, this.$chooseAppText);
                    } else if (i10 == 2) {
                        ReadLinkShareSheetKt.handleTwitterShare(this.$state, this.$shareLauncher, this.$vm, this.$chooseAppText);
                    } else if (i10 == 3) {
                        ReadLinkShareSheetKt.handleMoreShare(this.$state, this.$shareLauncher, this.$chooseAppText);
                    } else {
                        c6.p();
                        return null;
                    }
                }
            }
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
