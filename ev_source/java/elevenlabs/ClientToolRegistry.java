package io.elevenlabs;

import android.util.Log;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import fr.d0;
import fr.g0;
import fr.j2;
import fr.r0;
import ho.l;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import mr.d;
import mr.e;
import tn.o;
import wn.c;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016JC\u0010\u0019\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0018\b\u0002\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u0011J\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\u0003J\r\u0010#\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\u0003R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lio/elevenlabs/ClientToolRegistry;", "", "<init>", "()V", "", "", "parameters", "Lsn/z;", "validateParameters", "(Ljava/util/Map;)V", DiagnosticsEntry.NAME_KEY, "Lio/elevenlabs/ClientTool;", "tool", "registerTool", "(Ljava/lang/String;Lio/elevenlabs/ClientTool;)V", "", "unregisterTool", "(Ljava/lang/String;)Z", "", "timeoutMs", "Lio/elevenlabs/ClientToolResult;", "executeTool", "(Ljava/lang/String;Ljava/util/Map;JLwn/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "callback", "executeToolAsync", "(Ljava/lang/String;Ljava/util/Map;Lho/l;)V", "", "getRegisteredTools", "()Ljava/util/List;", "isToolRegistered", "", "getToolCount", "()I", "clearAllTools", "cleanup", "Ljava/util/concurrent/ConcurrentHashMap;", "tools", "Ljava/util/concurrent/ConcurrentHashMap;", "Lfr/d0;", "scope", "Lfr/d0;", "Companion", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ClientToolRegistry {
    private static final long DEFAULT_TIMEOUT_MS = 30000;
    private final d0 scope;
    private final ConcurrentHashMap<String, ClientTool> tools = new ConcurrentHashMap<>();

    public ClientToolRegistry() {
        e eVar = r0.f9888a;
        this.scope = g0.c(d.f23445b.plus(g0.f()));
    }

    public static /* synthetic */ Object executeTool$default(ClientToolRegistry clientToolRegistry, String str, Map map, long j4, c cVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j4 = 30000;
        }
        return clientToolRegistry.executeTool(str, map, j4, cVar);
    }

    public static /* synthetic */ void executeToolAsync$default(ClientToolRegistry clientToolRegistry, String str, Map map, l lVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        clientToolRegistry.executeToolAsync(str, map, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateParameters(Map<String, ? extends Object> parameters) {
        if (parameters.size() <= 100) {
            for (Map.Entry<String, ? extends Object> entry : parameters.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key.length() <= 100) {
                    if (value instanceof String) {
                        if (((String) value).length() > 10000) {
                            c6.t("String parameter too long: ".concat(key));
                            return;
                        }
                    } else if (value instanceof Collection) {
                        if (((Collection) value).size() > 1000) {
                            c6.t("Collection parameter too large: ".concat(key));
                            return;
                        }
                    } else if ((value instanceof Map) && ((Map) value).size() > 100) {
                        c6.t("Map parameter too large: ".concat(key));
                        return;
                    }
                } else {
                    c6.t("Parameter key too long: ".concat(key));
                    return;
                }
            }
            return;
        }
        c6.t("Too many parameters (max 100)");
    }

    public final void cleanup() {
        g0.i(this.scope, null);
        this.tools.clear();
    }

    public final void clearAllTools() {
        Set<String> keySet = this.tools.keySet();
        keySet.getClass();
        List g12 = o.g1(keySet);
        this.tools.clear();
        Log.d("ClientToolRegistry", "Cleared " + g12.size() + " tools: " + g12);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeTool(String str, Map<String, ? extends Object> map, long j4, c<? super ClientToolResult> cVar) {
        ClientToolRegistry$executeTool$1 clientToolRegistry$executeTool$1;
        int i10;
        try {
            if (cVar instanceof ClientToolRegistry$executeTool$1) {
                clientToolRegistry$executeTool$1 = (ClientToolRegistry$executeTool$1) cVar;
                int i11 = clientToolRegistry$executeTool$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    clientToolRegistry$executeTool$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = clientToolRegistry$executeTool$1.result;
                    i10 = clientToolRegistry$executeTool$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            j4 = clientToolRegistry$executeTool$1.J$0;
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        ClientTool clientTool = this.tools.get(str);
                        if (clientTool == null) {
                            return ClientToolResult.INSTANCE.failure("Tool '" + str + "' not found");
                        }
                        ClientToolRegistry$executeTool$2 clientToolRegistry$executeTool$2 = new ClientToolRegistry$executeTool$2(this, map, clientTool, null);
                        clientToolRegistry$executeTool$1.J$0 = j4;
                        clientToolRegistry$executeTool$1.label = 1;
                        obj = g0.R(j4, clientToolRegistry$executeTool$2, clientToolRegistry$executeTool$1);
                        xn.a aVar = xn.a.f37986a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return (ClientToolResult) obj;
                }
            }
            if (i10 == 0) {
            }
            return (ClientToolResult) obj;
        } catch (j2 unused) {
            return ClientToolResult.INSTANCE.failure("Tool execution timed out after " + j4 + "ms");
        } catch (Exception e10) {
            return ClientToolResult.INSTANCE.failure("Tool execution failed: " + e10.getMessage());
        }
        clientToolRegistry$executeTool$1 = new ClientToolRegistry$executeTool$1(this, cVar);
        Object obj2 = clientToolRegistry$executeTool$1.result;
        i10 = clientToolRegistry$executeTool$1.label;
    }

    public final void executeToolAsync(String name, Map<String, ? extends Object> parameters, l callback) {
        name.getClass();
        parameters.getClass();
        g0.D(this.scope, null, null, new ClientToolRegistry$executeToolAsync$1(this, name, parameters, callback, null), 3);
    }

    public final List<String> getRegisteredTools() {
        Set<String> keySet = this.tools.keySet();
        keySet.getClass();
        return o.g1(keySet);
    }

    public final int getToolCount() {
        return this.tools.size();
    }

    public final boolean isToolRegistered(String name) {
        name.getClass();
        return this.tools.containsKey(name);
    }

    public final void registerTool(String name, ClientTool tool) {
        name.getClass();
        tool.getClass();
        if (!n.m0(name)) {
            if (!this.tools.containsKey(name)) {
                this.tools.put(name, tool);
                Log.d("ClientToolRegistry", "Registered client tool: ".concat(name));
                return;
            } else {
                c6.t(f.C("Tool with name '", name, "' is already registered"));
                return;
            }
        }
        c6.t("Tool name cannot be blank");
    }

    public final boolean unregisterTool(String name) {
        boolean z6;
        name.getClass();
        if (this.tools.remove(name) != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            Log.d("ClientToolRegistry", "Unregistered client tool: ".concat(name));
        }
        return z6;
    }
}
