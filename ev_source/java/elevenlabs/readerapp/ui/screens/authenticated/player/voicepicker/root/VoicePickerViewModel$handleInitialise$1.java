package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import ir.i1;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel$handleInitialise$1", f = "VoicePickerViewModel.kt", l = {121}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerViewModel$handleInitialise$1 extends yn.i implements p {
    int label;
    final /* synthetic */ VoicePickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerViewModel$handleInitialise$1(VoicePickerViewModel voicePickerViewModel, wn.c<? super VoicePickerViewModel$handleInitialise$1> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerViewModel$handleInitialise$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerViewModel$handleInitialise$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ir.i navigationFlow;
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
            navigationFlow = this.this$0.getNavigationFlow();
            final VoicePickerViewModel voicePickerViewModel = this.this$0;
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel$handleInitialise$1.1
                public final Object emit(VoicePickerSharedContract.NavigationEvent navigationEvent, wn.c<? super z> cVar) {
                    i1 i1Var;
                    i1 i1Var2;
                    boolean z6 = navigationEvent instanceof VoicePickerSharedContract.NavigationEvent.NavigateToVoiceCollection;
                    z zVar = z.f31622a;
                    if (z6) {
                        i1Var2 = VoicePickerViewModel.this.mutableControlEventsFlow;
                        Object emit = i1Var2.emit(new VoicePickerContract.ControlEvent.NavigateToVoiceCollection(((VoicePickerSharedContract.NavigationEvent.NavigateToVoiceCollection) navigationEvent).getCollection().getId()), cVar);
                        if (emit == xn.a.f37986a) {
                            return emit;
                        }
                        return zVar;
                    }
                    if (navigationEvent instanceof VoicePickerSharedContract.NavigationEvent.NavigateToVoiceDesign) {
                        i1Var = VoicePickerViewModel.this.mutableControlEventsFlow;
                        Object emit2 = i1Var.emit(VoicePickerContract.ControlEvent.NavigateToVoiceDesign.INSTANCE, cVar);
                        if (emit2 == xn.a.f37986a) {
                            return emit2;
                        }
                        return zVar;
                    }
                    c6.p();
                    return null;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((VoicePickerSharedContract.NavigationEvent) obj2, (wn.c<? super z>) cVar);
                }
            };
            this.label = 1;
            Object collect = navigationFlow.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
