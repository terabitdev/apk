package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.readerapp.core.extensions.CoroutineExtensionsKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerScreenKt$VoicePickerScreen$5$1", f = "VoicePickerScreen.kt", l = {110}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerScreenKt$VoicePickerScreen$5$1 extends yn.i implements p {
    final /* synthetic */ ho.a $navigateBack;
    final /* synthetic */ ho.l $navigateToVoiceCollection;
    final /* synthetic */ ho.a $navigateToVoiceDesign;
    final /* synthetic */ VoicePickerViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerScreenKt$VoicePickerScreen$5$1(VoicePickerViewModel voicePickerViewModel, ho.a aVar, ho.l lVar, ho.a aVar2, wn.c<? super VoicePickerScreenKt$VoicePickerScreen$5$1> cVar) {
        super(2, cVar);
        this.$viewModel = voicePickerViewModel;
        this.$navigateBack = aVar;
        this.$navigateToVoiceCollection = lVar;
        this.$navigateToVoiceDesign = aVar2;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerScreenKt$VoicePickerScreen$5$1(this.$viewModel, this.$navigateBack, this.$navigateToVoiceCollection, this.$navigateToVoiceDesign, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerScreenKt$VoicePickerScreen$5$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            ir.i throttleDistinct$default = CoroutineExtensionsKt.throttleDistinct$default(this.$viewModel.getControlEventsFlow(), 300L, null, 2, null);
            final ho.a aVar = this.$navigateBack;
            final ho.l lVar = this.$navigateToVoiceCollection;
            final ho.a aVar2 = this.$navigateToVoiceDesign;
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerScreenKt$VoicePickerScreen$5$1.1
                public final Object emit(VoicePickerContract.ControlEvent controlEvent, wn.c<? super z> cVar) {
                    if (controlEvent instanceof VoicePickerContract.ControlEvent.CloseScreen) {
                        ho.a.this.invoke();
                    } else if (controlEvent instanceof VoicePickerContract.ControlEvent.NavigateToVoiceCollection) {
                        lVar.invoke(((VoicePickerContract.ControlEvent.NavigateToVoiceCollection) controlEvent).getCollectionId());
                    } else if (controlEvent instanceof VoicePickerContract.ControlEvent.NavigateToVoiceDesign) {
                        aVar2.invoke();
                    } else {
                        c6.p();
                        return null;
                    }
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((VoicePickerContract.ControlEvent) obj2, (wn.c<? super z>) cVar);
                }
            };
            this.label = 1;
            Object collect = throttleDistinct$default.collect(jVar, this);
            xn.a aVar3 = xn.a.f37986a;
            if (collect == aVar3) {
                return aVar3;
            }
        }
        return z.f31622a;
    }
}
