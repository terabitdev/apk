package io.elevenlabs.readerapp.core.router;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.core.router.RouterKt$Router$16$1$5$1$navigateToReadDetailsOrPlayer$1", f = "Router.kt", l = {457, 458}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RouterKt$Router$16$1$5$1$navigateToReadDetailsOrPlayer$1 extends yn.i implements ho.p {
    final /* synthetic */ Analytics.Event.PlayerAddToQueueClicked.Source $addToQueueSource;
    final /* synthetic */ String $collectionId;
    final /* synthetic */ Analytics.Event.PlayerActivationSource $playerActivationSource;
    final /* synthetic */ String $readId;
    final /* synthetic */ na.c0 $this_navigateToReadDetailsOrPlayer;
    final /* synthetic */ RouterViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterKt$Router$16$1$5$1$navigateToReadDetailsOrPlayer$1(RouterViewModel routerViewModel, String str, na.c0 c0Var, String str2, Analytics.Event.PlayerActivationSource playerActivationSource, Analytics.Event.PlayerAddToQueueClicked.Source source, wn.c<? super RouterKt$Router$16$1$5$1$navigateToReadDetailsOrPlayer$1> cVar) {
        super(2, cVar);
        this.$vm = routerViewModel;
        this.$readId = str;
        this.$this_navigateToReadDetailsOrPlayer = c0Var;
        this.$collectionId = str2;
        this.$playerActivationSource = playerActivationSource;
        this.$addToQueueSource = source;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new RouterKt$Router$16$1$5$1$navigateToReadDetailsOrPlayer$1(this.$vm, this.$readId, this.$this_navigateToReadDetailsOrPlayer, this.$collectionId, this.$playerActivationSource, this.$addToQueueSource, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((RouterKt$Router$16$1$5$1$navigateToReadDetailsOrPlayer$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r0 == r7) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r0 == r7) goto L17;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object isReadInLibrary;
        Object Router$lambda$20$0$4$0$navigateToPlayerWithClearQueueConfirmation;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
            isReadInLibrary = obj;
        } else {
            sn.a.g(obj);
            RouterViewModel routerViewModel = this.$vm;
            String str = this.$readId;
            this.label = 1;
            isReadInLibrary = routerViewModel.isReadInLibrary(str, this);
        }
        if (((Boolean) isReadInLibrary).booleanValue()) {
            na.c0 c0Var = this.$this_navigateToReadDetailsOrPlayer;
            RouterViewModel routerViewModel2 = this.$vm;
            String str2 = this.$readId;
            String str3 = this.$collectionId;
            Analytics.Event.PlayerActivationSource playerActivationSource = this.$playerActivationSource;
            Analytics.Event.PlayerAddToQueueClicked.Source source = this.$addToQueueSource;
            this.label = 2;
            Router$lambda$20$0$4$0$navigateToPlayerWithClearQueueConfirmation = RouterKt.Router$lambda$20$0$4$0$navigateToPlayerWithClearQueueConfirmation(c0Var, routerViewModel2, str2, str3, playerActivationSource, source, this);
        } else {
            NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, this.$this_navigateToReadDetailsOrPlayer, Routes.INSTANCE.readDetails(this.$readId), false, null, 6, null);
        }
        return sn.z.f31622a;
    }
}
