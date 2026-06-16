package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import com.google.protobuf.c6;
import java.util.List;
import kotlin.Metadata;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingScreenKt$GenFMLoadingUI$4$1$1$2$1$1", f = "GenFMLoadingScreen.kt", l = {292}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class GenFMLoadingScreenKt$GenFMLoadingUI$4$1$1$2$1$1 extends yn.i implements ho.p {
    final /* synthetic */ z0 $currentMessage$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenFMLoadingScreenKt$GenFMLoadingUI$4$1$1$2$1$1(z0 z0Var, wn.c<? super GenFMLoadingScreenKt$GenFMLoadingUI$4$1$1$2$1$1> cVar) {
        super(2, cVar);
        this.$currentMessage$delegate = z0Var;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new GenFMLoadingScreenKt$GenFMLoadingUI$4$1$1$2$1$1(this.$currentMessage$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((GenFMLoadingScreenKt$GenFMLoadingUI$4$1$1$2$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        LoadingMessage GenFMLoadingUI$lambda$6$0$0$1$1;
        List list;
        LoadingMessage GenFMLoadingUI$lambda$6$0$0$1$12;
        List list2;
        LoadingMessage GenFMLoadingUI$lambda$6$0$0$1$13;
        List list3;
        List list4;
        LoadingMessage loadingMessage;
        List list5;
        List list6;
        LoadingMessage GenFMLoadingUI$lambda$6$0$0$1$14;
        List list7;
        List list8;
        List list9;
        LoadingMessage GenFMLoadingUI$lambda$6$0$0$1$15;
        List list10;
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
            GenFMLoadingUI$lambda$6$0$0$1$1 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$6$0$0$1$1(this.$currentMessage$delegate);
            long m1690getDelayUwyO8pc = GenFMLoadingUI$lambda$6$0$0$1$1.m1690getDelayUwyO8pc();
            this.label = 1;
            Object n2 = fr.g0.n(m1690getDelayUwyO8pc, this);
            xn.a aVar = xn.a.f37986a;
            if (n2 == aVar) {
                return aVar;
            }
        }
        z0 z0Var = this.$currentMessage$delegate;
        list = GenFMLoadingScreenKt.loopingLoaderMessages;
        GenFMLoadingUI$lambda$6$0$0$1$12 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$6$0$0$1$1(this.$currentMessage$delegate);
        if (list.indexOf(GenFMLoadingUI$lambda$6$0$0$1$12) > -1) {
            list8 = GenFMLoadingScreenKt.loopingLoaderMessages;
            list9 = GenFMLoadingScreenKt.loopingLoaderMessages;
            GenFMLoadingUI$lambda$6$0$0$1$15 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$6$0$0$1$1(this.$currentMessage$delegate);
            int indexOf = list9.indexOf(GenFMLoadingUI$lambda$6$0$0$1$15) + 1;
            list10 = GenFMLoadingScreenKt.loopingLoaderMessages;
            loadingMessage = (LoadingMessage) list8.get(indexOf % list10.size());
        } else {
            list2 = GenFMLoadingScreenKt.initialLoaderMessages;
            GenFMLoadingUI$lambda$6$0$0$1$13 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$6$0$0$1$1(this.$currentMessage$delegate);
            int indexOf2 = list2.indexOf(GenFMLoadingUI$lambda$6$0$0$1$13);
            list3 = GenFMLoadingScreenKt.initialLoaderMessages;
            if (indexOf2 < ig.f.y(list3)) {
                list5 = GenFMLoadingScreenKt.initialLoaderMessages;
                list6 = GenFMLoadingScreenKt.initialLoaderMessages;
                GenFMLoadingUI$lambda$6$0$0$1$14 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$6$0$0$1$1(this.$currentMessage$delegate);
                int indexOf3 = list6.indexOf(GenFMLoadingUI$lambda$6$0$0$1$14) + 1;
                list7 = GenFMLoadingScreenKt.initialLoaderMessages;
                loadingMessage = (LoadingMessage) list5.get(indexOf3 % list7.size());
            } else {
                list4 = GenFMLoadingScreenKt.loopingLoaderMessages;
                loadingMessage = (LoadingMessage) tn.o.w0(list4);
            }
        }
        z0Var.setValue(loadingMessage);
        return sn.z.f31622a;
    }
}
