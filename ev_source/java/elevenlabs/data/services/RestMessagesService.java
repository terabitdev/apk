package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.MessagesAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.GetMessageResponseModel;
import io.elevenlabs.data.model.response.MessageButtonResponseModel;
import io.elevenlabs.data.model.response.MessageResponseModel;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ButtonData;
import io.elevenlabs.domain.model.Message;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.MessagesService;
import ir.r;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/data/services/RestMessagesService;", "Lio/elevenlabs/domain/services/MessagesService;", "Lio/elevenlabs/data/api/MessagesAPI;", "messagesAPI", "Lio/elevenlabs/domain/services/AuthService;", "authService", "<init>", "(Lio/elevenlabs/data/api/MessagesAPI;Lio/elevenlabs/domain/services/AuthService;)V", "", "uid", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lsn/z;", "markMessageAsRead", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/Message;", "getMessage", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/MessagesAPI;", "Lio/elevenlabs/domain/services/AuthService;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RestMessagesService implements MessagesService {
    private final AuthService authService;
    private final MessagesAPI messagesAPI;

    public RestMessagesService(MessagesAPI messagesAPI, AuthService authService) {
        messagesAPI.getClass();
        authService.getClass();
        this.messagesAPI = messagesAPI;
        this.authService = authService;
    }

    public static /* synthetic */ Message a(GetMessageResponseModel getMessageResponseModel) {
        return getMessage$lambda$0(getMessageResponseModel);
    }

    public static final Message getMessage$lambda$0(GetMessageResponseModel getMessageResponseModel) {
        getMessageResponseModel.getClass();
        MessageResponseModel message = getMessageResponseModel.getMessage();
        ButtonData buttonData = null;
        if (message == null) {
            return null;
        }
        String uid = message.getUid();
        String title = message.getTitle();
        String textMarkdown = message.getTextMarkdown();
        String subtitle = message.getSubtitle();
        MessageButtonResponseModel button = message.getButton();
        if (button != null) {
            buttonData = new ButtonData(button.getText(), button.getDeeplink());
        }
        return new Message(uid, title, textMarkdown, subtitle, buttonData);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r6 == r4) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // io.elevenlabs.domain.services.MessagesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getMessage(wn.c<? super AsyncCallResult<Message>> cVar) {
        RestMessagesService$getMessage$1 restMessagesService$getMessage$1;
        Object obj;
        int i10;
        if (cVar instanceof RestMessagesService$getMessage$1) {
            restMessagesService$getMessage$1 = (RestMessagesService$getMessage$1) cVar;
            int i11 = restMessagesService$getMessage$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restMessagesService$getMessage$1.label = i11 - Integer.MIN_VALUE;
                obj = restMessagesService$getMessage$1.result;
                i10 = restMessagesService$getMessage$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new h(3));
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ir.i isSignedIn = this.authService.isSignedIn();
                    restMessagesService$getMessage$1.label = 1;
                    obj = r.w(isSignedIn, restMessagesService$getMessage$1);
                }
                if (!m.c(obj, Boolean.FALSE)) {
                    return new AsyncCallResult.Success(null);
                }
                MessagesAPI messagesAPI = this.messagesAPI;
                restMessagesService$getMessage$1.label = 2;
                obj = messagesAPI.getMessage(restMessagesService$getMessage$1);
            }
        }
        restMessagesService$getMessage$1 = new RestMessagesService$getMessage$1(this, cVar);
        obj = restMessagesService$getMessage$1.result;
        i10 = restMessagesService$getMessage$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        if (!m.c(obj, Boolean.FALSE)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.MessagesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object markMessageAsRead(String str, wn.c<? super AsyncCallResult<z>> cVar) {
        RestMessagesService$markMessageAsRead$1 restMessagesService$markMessageAsRead$1;
        int i10;
        if (cVar instanceof RestMessagesService$markMessageAsRead$1) {
            restMessagesService$markMessageAsRead$1 = (RestMessagesService$markMessageAsRead$1) cVar;
            int i11 = restMessagesService$markMessageAsRead$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restMessagesService$markMessageAsRead$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restMessagesService$markMessageAsRead$1.result;
                i10 = restMessagesService$markMessageAsRead$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    MessagesAPI messagesAPI = this.messagesAPI;
                    restMessagesService$markMessageAsRead$1.L$0 = null;
                    restMessagesService$markMessageAsRead$1.label = 1;
                    obj = messagesAPI.markMessageAsDisplayed(str, restMessagesService$markMessageAsRead$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.toDomain((ApiResult) obj);
            }
        }
        restMessagesService$markMessageAsRead$1 = new RestMessagesService$markMessageAsRead$1(this, cVar);
        Object obj2 = restMessagesService$markMessageAsRead$1.result;
        i10 = restMessagesService$markMessageAsRead$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.toDomain((ApiResult) obj2);
    }
}
