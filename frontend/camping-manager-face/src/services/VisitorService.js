import httpCommon from "./http-common";

const VISITOR_REQUEST = "api/visitor";

export const getVisitors = () => {
    return httpCommon.get(VISITOR_REQUEST);
};