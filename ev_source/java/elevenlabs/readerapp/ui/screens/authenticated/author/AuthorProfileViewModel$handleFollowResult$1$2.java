package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.model.NotificationPrimerSource;
import io.elevenlabs.domain.services.NotificationPermissionService;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel$handleFollowResult$1$2", f = "AuthorProfileScreen.kt", l = {292}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AuthorProfileViewModel$handleFollowResult$1$2 extends yn.i implements ho.p {
    int label;
    final /* synthetic */ AuthorProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorProfileViewModel$handleFollowResult$1$2(AuthorProfileViewModel authorProfileViewModel, wn.c<? super AuthorProfileViewModel$handleFollowResult$1$2> cVar) {
        super(2, cVar);
        this.this$0 = authorProfileViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AuthorProfileViewModel$handleFollowResult$1$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AuthorProfileViewModel$handleFollowResult$1$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        NotificationPermissionService notificationPermissionService;
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
            notificationPermissionService = this.this$0.notificationPermissionService;
            NotificationPrimerSource notificationPrimerSource = NotificationPrimerSource.SUBSCRIBE_AUTHOR;
            this.label = 1;
            Object requestPrimer = notificationPermissionService.requestPrimer(notificationPrimerSource, this);
            xn.a aVar = xn.a.f37986a;
            if (requestPrimer == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
